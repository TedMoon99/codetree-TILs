import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        // input
        int first = sc.nextInt();
        int middle = sc.nextInt();
        int last = sc.nextInt();
        // output
        System.out.printf("0%d-%d-%d", first, last, middle);

    }
}