
import java.util.Scanner;
public class Series {
    static int MAX=1000;
    public static void main(String arg[])
    {

        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        if(n%2 == 1)
            faro (n/2 + 1);
        else
            prime(n/2);
        return ;

    }
     static void faro(int n)
    {
        int i, t1 = 1, t2 = 1, nextTerm;
        for (i = 2; i<=n; i++)
        {
            nextTerm = t1 + t2;
            t1 = t2;
            t2 = nextTerm;
        }
        System.out.print(t1);
    }
    static void prime(int n)
    {
        int i, j, flag, count =0;
        for (i=2; i<=MAX; i++)
        {
            flag = 0;
            for (j=2; j<i; j++)
            {
                if(i%j == 0)
                {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                if(++count == n)
                {
                    System.out.print(i);
                    break;
                }
        }

    }

}
