import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();

        int max = Math.max(a, b), min = Math.min(a, b);

        System.out.println(max-min);
    }
}