import java.util.Scanner;

public class Reverse {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char arr1[]=str.toCharArray();
        char arr2[]=palin(arr1);
        int count=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]==arr2[i])
                continue;
            else {
                count++;
            }
        }
        if(count>0)
            System.out.print("false");
        else
            System.out.print("true");
    }
    static char[] palin(char arr1[])
    {
        int c=0;
        int len=arr1.length;
        char arr[]=new char[len];
        for(int i=len-1;i>=0;i--)
        {
            arr[c]=arr1[i];
            c++;
        }
        return arr;
    }
}
