import java.util.Scanner;

public class N_term {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==1)
        {
            int input=n/2;
            int x=input-1;
            int output= (int) Math.pow(2,x);
            System.out.print(output);
        }
        else
        {
            int input=(n+1)/2;
            int x=input-1;
            int output= (int) Math.pow(3,x);
            System.out.print(output);
        }

    }
}
