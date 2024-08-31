import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();

        String result = "";
        result = (a % 2 == 0)? "even": "odd";
        System.out.println(result);
        result = (b % 2 == 0)? "even": "odd";
        System.out.println(result);
    }
}