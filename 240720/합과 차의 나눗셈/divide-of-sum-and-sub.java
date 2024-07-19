import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();
        double result = Math.round((a+b)  * 1000/ (a-b)) / 1000.0 ;
        System.out.printf("%.2f", result);
    }
}