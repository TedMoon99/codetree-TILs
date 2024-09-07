import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int result = 0;

        result = (b >a && b < c)? 1: 0;

        System.out.println(result);

    }
}