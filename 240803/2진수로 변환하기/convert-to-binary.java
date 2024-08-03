import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = new int[20];
        int cnt = 0;
        while (true){
            if (n < 2){
                digits[cnt++] = n;
                break;
            }
            digits[cnt++] = n % 2;
            n /= 2;
        }

        for (int i = cnt-1; i>= 0; i--){
            System.out.print(digits[i]);
        }
    }
}