import java.util.Scanner;

public class Main {
    public static int[] A, record;
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        n = sc.nextInt();
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
        }

        System.out.println(max);
    }

    private static int maxLength(int i) {
        if (i >= n - 1) return 1;
        if (A[i] >= A[i + 1]) return 1;
        return maxLength(i + 1) + 1;
    }
}