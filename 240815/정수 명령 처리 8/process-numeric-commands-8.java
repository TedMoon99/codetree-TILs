import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            String command = sc.next();
            fun(linkedList, command, sc);
        }


    }

    private static void fun(LinkedList<Integer> A, String command, Scanner sc){
        int num = 0;
        if (command.equals("push_front")){
            num = sc.nextInt();
            A.addFirst(num);
        } else if (command.equals("push_back")){
            num = sc.nextInt();
            A.addLast(num);
        } else if (command.equals("pop_front")){
            num = A.pollFirst();
            System.out.println(num);
        } else if (command.equals("pop_back")){
            num = A.pollLast();
            System.out.println(num);
        } else if(command.equals("size")){
            num = A.size();
            System.out.println(num);
        } else if (command.equals("empty")){
            num = (A.isEmpty())? 1 : 0;
            System.out.println(num);
        } else if (command.equals("front")){
            num = A.peekFirst();
            System.out.println(num);
        } else if (command.equals("back")){
            num = A.peekLast();
            System.out.println(num);
        }
    }
}