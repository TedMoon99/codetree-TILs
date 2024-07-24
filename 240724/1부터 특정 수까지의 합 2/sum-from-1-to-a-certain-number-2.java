import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // function call
        
        System.out.println(factorial(n));

    }

    // 팩토리얼 계산(1 ~ n까지의 곱을 반환하는 팩토리얼 함수)
    private static int factorial(int n){
        if (n <= 1) return 1;
        return n + factorial(n-1);
    }
}