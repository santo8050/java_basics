import java.util.Scanner;
import java.util.Stack;

public class balance {
    public static  void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        Stack<Character> ob = new Stack<>();
        boolean isBalanced = true;
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                ob.push(ch);
                continue;
            }
            if (ob.isEmpty()) {
                isBalanced = false;
                break;
            }
            if (ch == ')') {
                if (ob.peek() == '(') {
                    ob.pop();
                } else {
                    isBalanced = false;
                    break;
                }
            }
            if (ch == '}') {
                if (ob.peek() == '{') {
                    ob.pop();
                } else {
                    isBalanced = false;
                    break;
                }
            }
            if (ch == ']') {
                if (ob.peek() == '[') {
                    ob.pop();
                } else {
                    isBalanced = false;
                    break;
                }
            }
        }

        if(!ob.isEmpty())
            isBalanced=false;
        if(isBalanced)
            System.out.println("balanced");
        else
            System.out.println("not balanced");
    }

}
