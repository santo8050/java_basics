import java.util.Scanner;

public class faco {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int term1=1;
        int term2=1;
        System.out.print(term1+" "+term2+" ");
        for(int i=2;i<N;i++) {
            int term3 = term1 + term2;
            System.out.print(term3 + " ");
            term1 = term2;
            term2 = term3;
        }
    }
}
