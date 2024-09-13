import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String c = sc.next();
        int n = sc.nextInt();
        
        if (c.equals("A")){
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = n; i > 0; i--) {
                System.out.print(i + " ");
            }
        }
    }
}