import java.util.Scanner;

public class N_term_sum {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int inp=0;
        int x=0;
        int out=0;
        if(n%2==0)
        {
            inp=n/2;
            x=inp-1;
            out=x;
            System.out.print(out);
        }
        else
        {
            inp=(n+1)/2;
            x=inp-1;
            out=(x*2);
            System.out.print(out);
        }
    }

}
