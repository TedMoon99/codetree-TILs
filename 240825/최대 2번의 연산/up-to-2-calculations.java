import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int result = (a % 2 == 0)? (int) (a / 2): (int) (++a/2);
        result = (result % 2 == 0)? (int) (result / 2): (int) (++result/2);

        System.out.println(result);
    }
}