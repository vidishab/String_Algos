public class exact_string_matching {
    static void find(String text, String pat)
    {
        int n=text.length();
        int m=pat.length();
        for(int i=0;i<n;i++)
        {
            int j=0;
            while (text.charAt(i)==pat.charAt(j))
            {
                i++;
                j++;
                if(j==m-1)
                {
                    System.out.println("Pattern found at " + (i-j));
                    break;
                }
            }
        }
    }
    static void find1(String text, String pat)
    {
        int n=text.length();
        int m=pat.length();
        for(int i=0;i<n;i++)
        {
            int j;
            for(j=0;j<m;j++)
            {
                if(text.charAt(i+j)!=pat.charAt(j))
                    break;
            }
            if(j==m)
                System.out.println("Pattern found at " + i);

        }
    }
    public static void main(String args[])
    {
        String text="aabababcd";
        String pat="abab";
        find(text,pat);
        find1(text,pat);
    }
}

