import java.util.Scanner;

public class bitwiseRev {
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(bitWise(n));
    }
    static int bitWise(int n)
    {
        int rev=0;
        while(n!=0)
        {
            rev<<=1;
            if((int)(n&1)==1)
                rev^=1;
            n>>=1;
        }
        return rev;
    }
}
