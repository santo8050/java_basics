import java.util.Scanner;

public class replace {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String str3=sc.nextLine();
        char s1[]=str1.toCharArray();
        char s2[]=str2.toCharArray();
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i]=='a'||s1[i]=='e'||s1[i]=='i'||s1[i]=='o'||s1[i]=='u'||s1[i]=='A'||s1[i]=='E'||s1[i]=='I'||s1[i]=='O'||s1[i]=='U')
            {
                str1=str1.replace(s1[i],'"');
            }
        }
        for(int i=0;i<s2.length;i++) {
            if(s2[i]=='a'||s2[i]=='e'||s2[i]=='i'||s2[i]=='o'||s2[i]=='u'||s2[i]=='A'||s2[i]=='E'||s2[i]=='I'||s2[i]=='O'||s2[i]=='U')
            {
                continue;
            } else
                str2=str2.replace(s2[i],'*');
        }
        System.out.print(str1+" "+str2+" "+ str3.toLowerCase());

        }
    }

