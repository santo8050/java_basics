import java.util.Scanner;

public class queue {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int Queue[]=new int[n];
    int size;
    int front=0;
    int rear=0;
    public void enQueue(int x)
    {
        if(rear>=n)
        {
            rear=0;
            Queue[rear]=x;
            rear++;
        }
        else {
            Queue[rear] = x;
            rear++;
        }
        System.out.println(rear);

    }
    public int deQueue()
    {
        int data;
        data=Queue[front];
        if(data==0) {
            return 0;
        }
        else
        {
            Queue[front]=0;
        front++;
        return data;
        }
    }
    public void show()
    {
        for(int x:Queue)
            System.out.print(x +" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        queue obj=new queue();
        obj.enQueue(12);
        obj.enQueue(24);
        obj.enQueue(36);
        obj.enQueue(48);
        obj.enQueue(60);
        obj.show();
        System.out.println(obj.deQueue());
        System.out.println(obj.deQueue());
        obj.enQueue(72);
        obj.enQueue(84);

        obj.show();
    }
}
