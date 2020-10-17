import java.util.Scanner;

public class stack {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    public char Stack[]=new char[n];
    int top =0;
    public static void main(String args[]){
        stack obj =new stack();
       boolean status= obj.isEmpty();
       System.out.println("status  : " + status);
        obj.size();
        obj.push('c');
        obj.push('d');
        obj.push('e');
        obj.push('f');
        status=obj.isEmpty();
        System.out.println("status  : " + status);
        obj.size();
        obj.show();
        char popped=obj.pop();
        System.out.println(popped);
        char peeked=obj.peek();
        System.out.println(peeked);
        obj.size();
        popped=obj.pop();
        System.out.println(popped);
        peeked=obj.peek();
        System.out.println(peeked);
        status=obj.isEmpty();
        System.out.println("status  : " + status);

    }
    public void push(char data)
    {
        Stack[top]=data;
        top++;
    }
    public void show()
    {
        for(int i: Stack)
            System.out.println(i);
    }
    public char pop()
    {
        top--;
        char data;
        data=Stack[top];
        Stack[top]=0;
        return data;
    }
    public char peek()
    {
        char data;
        data=Stack[top-1];
        return data;
    }
    public void size() {
        System.out.println("NO of elements in stack : " + top);
    }
    public boolean isEmpty(){
        return top<=0;
    }
}
