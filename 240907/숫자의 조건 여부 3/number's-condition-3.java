import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println((a % 13 == 0 || a % 19 == 0)? "True": "False");

    }
}