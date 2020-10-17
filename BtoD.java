import java.util.Scanner;

public class BtoD {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        convert(n);
    }
    static void convert(int n)
    {
        int r=0,sum=0;
        int c=0;
        while(n!=0)
        {
            r=n%10;
            sum+=r*Math.pow(2,c);
            c++;
            n=n/10;
        }
        System.out.print(sum);
    }

}
