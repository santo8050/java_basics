import java.util.Scanner;

public class test{

    public int getLongestPrefixSuffix(String string){
        if(string==null || string.length()<=1)return 0;
        char[] parray=string.substring(0,string.length()-1).toCharArray();
        char[] sarray=string.substring(1,string.length()).toCharArray();
        int length=0;
        for(int i=0;i<sarray.length;i++){
            int j=0,k=i;
            while(j<parray.length && k<sarray.length){
                if(parray[j]==sarray[k])length++;
                else {
                    length=0;
                    break;
                }
                j++;k++;
            }
            if(length!=0)break;
        }
        return length;
    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            String string=sc.nextLine();
            test obj=new test();
            System.out.println(obj.getLongestPrefixSuffix(string));
        }
    }
}