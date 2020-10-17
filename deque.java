public class deque {
    int front=-1,rear=0;
    int size=5;
    int Deque[]=new int[size];

    public boolean isFull()
    {
        if((front==0 && rear==size -1)||front==rear+1)
            return true;
        else
            return false;
    }

    public boolean isEmpty()
    {
        return front==-1;
    }

    public void insertFront(int data) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        }
        if (front == 0) {
            front = size - 1;
            Deque[front]=data;
        }
        else{
            Deque[front]=data;
            front = front - 1;
        }
    }

    public void insertRear(int data)
    {
        if(isFull())
        {
            System.out.println("Overflow");
            return;
        }
        if(isEmpty())
        {
            front=0;
            rear=0;
        }
        if(rear==size-1) {
            rear = 0;
            Deque[rear]=data;
        }
        else {
            Deque[rear] = data;
            rear = rear + 1;
        }
    }

    public void removeFront() {
        if(isEmpty())
        {
            System.out.println("Underflow");
            return;
        }
        if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        else if(front==size-1)
            front=0;
        else
            front=front+1;

    }

    public void removeRear() {
        if(isEmpty())
        {
            System.out.println("Underflow");
            return;
        }
        if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        else if(rear==0)
            rear=size-1;
        else
            rear=rear-1;
    }

    public int getFront()
    {
        if(isEmpty()) {
            System.out.println("underflow");
            return -1;
        }
        return Deque[front];
    }

    public int getRear()
    {
        if(isEmpty()) {
            System.out.println("underflow");
            return -1;
        }
        return Deque[rear-1];
    }
    public void show()
    {
        for(int x:Deque)
            System.out.print(x+" ");
    }
    public static void main(String args[])
    {
        deque dq = new deque();
        dq.show();

        System.out.println("Insert element at rear end  : 5 ");
        dq.insertRear(5);
        dq.show();

        System.out.println("insert element at rear end : 10 ");
        dq.insertRear(10);
        dq.show();

        System.out.println("get rear element : "+ dq.getRear());

        dq.removeRear();
        System.out.println("After delete rear element new rear become : " +
                dq.getRear());
        dq.show();
        System.out.println();

        System.out.println("inserting element at front end");
        dq.insertFront(15);

        System.out.println("get front element: " +dq.getFront());

        dq.removeFront();

        System.out.println("After delete front element new front become : " +
                +  dq.getFront());
        dq.show();
    }
}
