import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();
        int max = Math.max(a, b), min = Math.min(a, b);
        for (int i = max; i >= min; i--) {
            System.out.print(i + " ");
        }
    }
}