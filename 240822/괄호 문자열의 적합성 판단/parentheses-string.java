import java.util.*;

public class Main {

    private static String input;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        input = sc.next();
        Stack<Character> A = new Stack<>();
        for (int i = 0; i < input.length(); i++){
            if (A.isEmpty())
                A.push(input.charAt(i));
            else if (input.charAt(i) == '('){
                if(A.peek() == ')')
                    break;
                else
                    A.push(input.charAt(i));
            } else if(input.charAt(i) == ')'){
                if (A.peek() == '(')
                    A.pop();
                else
                    break;
            }
        }

        System.out.println((A.isEmpty())? "Yes": "No");
    }
}