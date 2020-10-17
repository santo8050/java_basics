import java.util.Scanner;
public class area {
    //public static void main(String args[])
    //{
        //Scanner sc = new Scanner(System.in);
      //  Double r=sc.nextDouble();
    //    System.out.print(Math.PI*r*r);
  //  }
//}
static double area_of_a_circle(double radius)
        {
        return Math.PI * radius * radius;
        }

public static void main (String[] args)
        {
        double radius;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the radius of the circle : ");
        radius = sc.nextDouble();
        System.out.println("Area of the circle : " + area_of_a_circle(radius));

        }
        }