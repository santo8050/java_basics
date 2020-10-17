import java.util.Scanner;

public class armStrong {
    static int sun=0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int c = 0;
        while (temp != 0) {
            c++;
            temp = temp / 10;
        }
        temp = n;
        System.out.print(arm(temp,c));
    }
    static int arm(int n,int c)
    {
        while(n!=0)
        {
            int r=n%10;
            sun=sun+pow(r,c);
            n=n/10;
        }
        return sun;
    }
    static int pow(int r,int c)
    {
        if(c==0)
            return 1;
        else
            return r*pow(r,c-1);
    }


}
