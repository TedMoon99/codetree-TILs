import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static int n, num;
    public static Stack<Integer> A;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        A = new Stack<>();

        // input
        for(int i = 0; i < n; i++){
            String command = sc.next();
            num = (command.equals("push"))? sc.nextInt(): 0;
            stack(command);
        }
    }

    private static void stack(String command){
        if (command.equals("push")){
            A.push(num);
        } else if (command.equals("pop")){
            System.out.println(A.pop());
        } else if (command.equals("top")){
            System.out.println(A.peek());
        } else if (command.equals("size")){
            System.out.println(A.size());
        } else if (command.equals("empty")){
            System.out.println((A.isEmpty())? 1: 0);
        }
    }
}