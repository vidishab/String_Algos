import java.util.ArrayList;

public class reversing_line_string {
    static String get(String str,int first,int last)
    {
        char arr[]=str.toCharArray();
        for(int c=first,d=last;c<=d;c++,d--)
        {
            char temp=arr[c];
            arr[c]=arr[d];
            arr[d]=temp;
        }
        str=new String(arr);
        return str;
    }
    static String[] findres(String a[],int first,int last)
    {
        for(int c=first,d=last-1;c<d;c++,d--)
        {
            String temp=a[c];
            a[c]=a[d];
            a[d]=temp;
        }
        return a;
    }
    static String find(String str)
    {
        int word_begin = 0;
        char arr[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                str = get(str, word_begin, i);
                word_begin = i;
            }
        }
        return str;
    }
    static void prog(String str)
    {
        int count = 0;
        String a[] = new String[100];
        str=find(str);
        for(int i=0;i<a.length;i++)
            a[i]="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                count++;
                continue;
            }
            a[count]=a[count]+str.charAt(i);
        }
        a=findres(a,0,count);
        for(int i=0;i<count;i++)
        {
            a[i]=get(a[i],0,a[i].length()-1);
        }
        for(int i=0;i<count;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String args[])
    {
        String str=" I am tired of my own life ";
        prog(str);
    }
}

