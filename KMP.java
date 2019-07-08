public class KMP {
    static int F[];
    static void prefix(String p , int m)
    {
        F=new int[p.length()];
        F[0]=0;
        int i=1,j=0;
        while (i<m)
        {
            if(p.charAt(i)==p.charAt(j))
            {
                F[i]=j+1;
                i++;
                j++;
            }
            else if(j>0)
            {
                j=F[j-1];
            }
            else
            {
                F[i]=0;
                i++;
            }
        }
    }
    static int kmp(String t,int n,String p, int m)
    {
        int i=0,j=0;
        prefix(p,m);
        while (i<n)
        {
            if(t.charAt(i)==p.charAt(j))
            {
                if(j==(m-1))
                {
                    return(i-j);
                }
                else
                {
                    i++;
                    j++;
                }
            }
            else if(j>0)
            {
                j=F[j-1];
            }
            else
                i++;
        }
        return -1;
    }
    public static void main(String args[])
    {
        String t="ababaccde";
        String p = "acc";
        int n=t.length();
        int m=p.length();
        System.out.println(kmp(t,n,p,m));
    }
}

