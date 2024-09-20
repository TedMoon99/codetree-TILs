import java.util.Scanner;


public class Main {
    public static int[] A, record;
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        n = sc.nextInt();
        A = new int[n];
        record = new int[n + 1];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        record[1] = 1;
        for (int i = 1; i < n; i++) {
            // 부호가 동일한 숫자
            if (plusMinus(A[i]) != plusMinus(A[i-1])) record[i + 1] = 1;
            else record[i+1] = record[i]+1;
        }

        // Test
        int max = record[0];
        for (int i = 0; i < n+1; i++) {
            max = Math.max(max, record[i]);
        }

        System.out.println(max);
    }

    // 부호를 판별
//    1 : plus
//    0 : minus
    static int plusMinus(int num){
        return (num > 0)? 1: 0;
    }
}