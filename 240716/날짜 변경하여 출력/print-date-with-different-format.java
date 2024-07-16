import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Set Scanner
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\.");
        // input
        int year = sc.nextInt();
        int month = sc.nextInt();
        int date = sc.nextInt();
        // output
        System.out.printf("%d-%d-%d", month, date, year);
    }
}