import java.util.Scanner;

public class DtoO {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int arr[]= new int[10];
        int c=0;
        while(temp!=0)
        {
            int r=temp%8;
            arr[c]=r;
            c++;
            temp=temp/8;
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
