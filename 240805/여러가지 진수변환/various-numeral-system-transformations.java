import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), b = sc.nextInt();
        // function call
        makeDigits(n, b);

    }

    private static void makeDigits(int n, int b){
        int cnt = 0;
        int[] digits = new int[n];
        // 10진수인 N을 2진수로 변경한
        while(true){
            if (n < b){
                digits[cnt++] = n;
                break;
            }
            digits[cnt++] = n % b;
            n /= b;
        }
        // Test
        for(int i = cnt-1; i >= 0; i--){
            System.out.print(digits[i]);
        }
    }
}