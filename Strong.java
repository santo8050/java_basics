import java.util.Scanner;

public class Strong {
    public static void main(String arg[])
    {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        while(n!=0)
        {
            int req=n%10;
            int fact=factorial(req);
            sum+=fact;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("true");
        else
            System.out.println("false");
    }
    static int factorial(int req)
    {
        if(req==1)
            return 1;
        else
            return req*factorial(req-1);
    }
}
