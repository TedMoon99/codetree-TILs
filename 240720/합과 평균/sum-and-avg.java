import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();


        // output
        System.out.printf("%d %.1f", (a+b), (double) (a+b) / 2);
    }
}