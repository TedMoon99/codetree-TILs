import java.util.*;

public class Main {

    public static int a, b, c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int min = (a >= b)? b: a;
        min = (min >= c)? c: min;

        System.out.println(min);
    }
}