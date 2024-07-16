import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        // 입력
        String s = sc.next();
        double a = sc.nextDouble(), b = sc.nextDouble();
        char c = s.charAt(0);
        // 출력
        System.out.println(c);
        System.out.printf("%.2f\n", a);
        System.out.printf("%.2f", b);
    }
}