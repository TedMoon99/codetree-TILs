import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        // input
        int a = sc.nextInt(), b = sc.nextInt();

        a += b;
        b += a;
        // Output
        System.out.print(a+ " " +b);
    }
}