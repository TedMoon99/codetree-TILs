import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        double ft = sc.nextDouble();
        // 출력
        System.out.printf("%.1f", ft * 30.48);
    }
}