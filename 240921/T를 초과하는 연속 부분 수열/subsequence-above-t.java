import java.util.Scanner;

public class Main {
    public static int[] A, record;
    public static int n, t;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        n = sc.nextInt();
        t = sc.nextInt();
        A = new int[n];
        record = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            record[i] = maxLength(i);
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, record[i]);
//            System.out.print(record[i] + " ");
        }

        System.out.println(max);
    }

    // t 보다 큰 수의 길이를 입력
    private static int maxLength(int i) {
        // index Out
        if (i >= n - 1) return 0;
        if (A[i] <= t) return 0;
        return maxLength(i + 1) + 1;
    }
}