import java.util.*;

public class Main {
    public static int n;
    public static int[][] A;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        A = new int[n][n];
        // input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // 탐색
        int maxCnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-2; j++) {
                maxCnt = Math.max(maxCnt, A[i][j] + A[i][j+1] + A[i][j+2]);
            }
        }

        // output
        System.out.println(maxCnt);
    }
}