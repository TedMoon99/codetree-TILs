import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int[] binary = new int[input.length()];
        int num = 0;

        // 2진수 배열 입력 받아오기
        for (int i = 0; i <input.length(); i++){
            binary[i] = input.charAt(i) - '0';
        }
        // 2진수 10진수로 변환
        for (int i = 0; i < binary.length; i++){
            num = num * 2 + binary[i];
        }
        // 10진수에 17배
        num *= 17;
        // function call
        makeDigits(num, 2);

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