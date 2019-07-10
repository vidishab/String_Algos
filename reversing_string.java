public class reversing_string {
    static void reverse(String str)
    {
        int n=str.length();
        char str1[]=str.toCharArray();
        for(int start=0,end=n-1;start<=end;start++,end--)
        {
            char temp=str1[end];
            str1[end]=str1[start];
            str1[start]=temp;
        }
        str=new String(str1);
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String args[])
    {
        String str="vidisha";
        reverse(str);
    }
}

