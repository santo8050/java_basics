import java.util.Scanner;

public class leap {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0) {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                    System.out.println(year + " is leap year");
                else
                    System.out.println(year + " is not a leap year");
            } else
                System.out.println(year + " is a leap year");
        }
        else
            System.out.println(year + " is not a leap year");
    }
}
