import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        int month = sc.nextInt();
        int date = sc.nextInt();
        int year = sc.nextInt();

        // 출력
        System.out.printf("%d.%d.%d", year, month, date);

    }
}