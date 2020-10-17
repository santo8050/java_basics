import java.util.*;
public class sum {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(path(a,b));
    }
    static int add(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
            return n+add(n-1);
    }
    static int pow(int a,int b)
    {
        if(b==0)
            return 1;
        else
            return a*pow(a,b-1);
    }
    static int fastpow(int a,int b)
    {
        if(b==0)
            return 1;
         if(b%2==0) {
             return fastpow(a * a, b / 2);
         }
            return a*fastpow(a,b-1);
    }
    static int path(int n,int m)
    {
        if(n==1||m==1)
            return 1;
        else
            return path(n-1,m) +path(n,m-1);
    }
}
