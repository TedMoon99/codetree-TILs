import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(fun(n));
    }

    private static int getSquare(int n){
        return n * n;
    }

    // 각 자리 숫자의 제곱의 합
    private static int fun(int n){
        if (n < 10) return getSquare(n);

        return getSquare(n % 10) + fun(n /10);
    }
}