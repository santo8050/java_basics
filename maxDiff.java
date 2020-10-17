import java.util.Scanner;

public class maxDiff {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int i;
        for(i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        maxDiff obj=new maxDiff();
        int x=obj.max(size,arr);
        int y=obj.min(size,arr);
        int maxIndex=obj.indexOf(x,size,arr);
        int minIndex=obj.indexOf(y,size,arr);
        obj.Compare(maxIndex,minIndex,arr);
    }
    public int max(int size,int arr[])
    {
        int Max=arr[0];
        for(int i=0;i<size;i++)
        {
           if(Max<arr[i])
                    Max=arr[i];
        }
        return Max;

    }
    public int min(int size,int arr[])
    {
        int Min=arr[0];
        for(int i=0;i<size;i++)
        {
            if(Min>arr[i])
                Min=arr[i];
        }
        return Min;

    }
    public int indexOf(int x,int size,int arr[])
    {
        int i;
        for( i=0;i<size;i++)
        {
            if(x==arr[i])
                break;
        }
        return i;
    }
    public void Compare(int x,int y,int arr[])
    {
        if(y<x)
        {
            System.out.println(arr[x]-arr[y]);
        }
        else
            System.out.println(" try again");
    }
}
