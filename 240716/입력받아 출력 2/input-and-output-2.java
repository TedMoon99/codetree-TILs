import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Set Scanner
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        // input
        int firstSsd = sc.nextInt();
        int lastSsd = sc.nextInt();
        // output
        System.out.printf("%d%d",firstSsd,lastSsd);
    }
}