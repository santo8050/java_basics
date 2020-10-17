import java.util.Scanner;

public class Leader {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int i;
        int arr[]=new int[size];
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        Leader obj= new Leader();
        obj.Display(size,arr);
    }
    public void Display(int size,int arr[])
    {
        int i,j,c=0;
        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(arr[i]>arr[j])
                    c++;
                else
                {
                    c=0;
                    break;
                }
            }
            if(c>0)
                System.out.println(arr[i]);
        }
    }
}
