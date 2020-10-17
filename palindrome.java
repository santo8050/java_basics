import java.util.Scanner;

public class palindrome {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int dummy=n;
        int temp=0;
        while(n!=0)
        {
            int req=n%10;
            temp=(temp*10)+req;
            n=n/10;
        }
        if(dummy==temp)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
