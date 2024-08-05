import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), num = 0;
        String n = sc.next();
        int[] binary = new int[n.length()];
        // a진수인 n을 비트별로 쪼갠다
        for (int i = 0; i < n.length(); i++){
            binary[i] = n.charAt(i) - '0';
        }
        // a진수인 n을 10진수로 바꾼다
        for (int i = 0; i < n.length(); i++){
            num = num * a + binary[i];
        }

        int cnt = 0;
        int[] digits = new int[100];
        // 10진수인 n을 b진수로 변환한다
        while(true){
            if (num < b){
                digits[cnt++] = num;
                break;
            }
            digits[cnt++] = num % b;
            num /= b;
        }
        // 출력한다
        for(int i = cnt-1; i >= 0; i--){
            System.out.print(digits[i]);
        }
    }
}