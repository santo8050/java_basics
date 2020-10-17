import java.util.Scanner;

public class gp {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int d1=sc.nextInt();
        int d2=sc.nextInt();
        int a=1,b=1;
        if(n%2==0)
        {
            for(int i=0;i<n;i++)
            {
                System.out.print(a+" ");
                a=a*d1;
                System.out.print(b+" ");
                b=b*d2;
            }
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                System.out.print(a+" ");
                a=a*d1;
                System.out.print(b+" ");
                b=b*d2;
            }
            System.out.print(a+" ");
        }
    }
}
