import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int result = (a % 2 == 0)? (int) (a / 2): a;
        result = (result % 2 == 1)? (int) (++result / 2): result;

        System.out.println(result);
    }
}