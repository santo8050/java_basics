import java.util.Arrays;
import java.util.Scanner;

public class DtoB {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        convert(n);
    }
    static void convert(int n)
    {
        int sum=0;
        int arr[]=new int[10];
        int c=0;
        while(n!=0)
        {
            int r=n%2;
            arr[c]=r;
            c++;
            n=n/2;
        }
        reverse(arr,c);
    }
    static void reverse(int arr[],int c)
    {
       for(int i=c-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
    }
}
