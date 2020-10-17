import java.util.Scanner;

public class large
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        large obj=new large();
       System.out.println(obj.div(n,m));
    }
    public int div(int N,int M)
    {
        int q,n1,n2;
        q=N/M;
        n1=q*M;
        if((N*M)>0)
            n2=(M*(q+1));
        else
            n2=(M*(q-1));
        if((Math.abs(n2-N))>(Math.abs(N-n1)))
            return n1;
        else
            return n2;
    }
}