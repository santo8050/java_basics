import java.util.Scanner;

public class longestPrefix {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int length=s.length();
        int mid=length/2;
        if(length<2)
        {
            System.out.println("-1");
            System.exit(0);
        }
        for(int i=mid;i>=0;i--)
        {
            String prefix=s.substring(0,i);
            System.out.println(prefix);
            String suffix=s.substring(length-i,length);
            System.out.println(prefix);
            if(suffix.equals("")||prefix.equals(""))
            {
                System.out.println("-1");
                System.exit(0);
            }
            if(suffix.equals(prefix))
            {
                System.out.println(suffix.length());
                break;
            }
        }
    }
}
