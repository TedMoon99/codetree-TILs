import java.util.*;

public class Main {

    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.print((i % 2 == 0 || i % 3 == 0)? 1 + " ": 0 + " ");
        }

    }
}