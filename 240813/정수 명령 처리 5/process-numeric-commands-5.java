import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ArrayList
        ArrayList<Integer> A = new ArrayList<Integer>();
        // input
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            String command = sc.next();
            int num = sc.nextInt();
            stack(A, command, num);            
        }
    }

    private static void stack(ArrayList<Integer> A,String command, int num){
        if (command == "push_back") A.add(num);
        else if(command == "get") System.out.println(A.get(num));
        else if(command =="size") System.out.println(A.size());
        else if (command =="pop_back") A.remove(A.size()-1);
    }
}