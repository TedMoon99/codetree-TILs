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
        switch (command){
            case "push":
                A.push(num);
                break;
            case "pop":
                System.out.println(A.pop());
                break;
            case "top":
                System.out.println(A.peek());
                break;
            case "size":
                System.out.println(A.size());
                break;
            case "empty":
                System.out.println((A.isEmpty())? 1: 0);
                break;
        }
    }
}