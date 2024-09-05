import java.util.Scanner;

public class Main {

    public static int n, m;
    public static int[][] A;
    private static int shape;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        A = new int[n][m];
        // input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // 1번 모양
        for (int i = 0; i < n-1; i++) {
            int tempSum = 0;
            for (int j = 0; j < m-1; j++) {
                int sum = A[i][j] + A[i + 1][j] + A[i + 1][j + 1];
                tempSum = Math.max(tempSum, sum);
            }
            shape = Math.max(shape, tempSum);
        }

        // 2번 모양
        for (int i = 0; i < n-1; i++) {
            int tempSum = 0;
            for (int j = 0; j < m-1; j++) {
                int sum = A[i][j] + A[i][j+1] + A[i + 1][j];
                tempSum = Math.max(tempSum, sum);
            }
            shape = Math.max(shape, tempSum);
        }

        // 3번 모양
        for (int i = 0; i < n-1; i++) {
            int tempSum = 0;
            for (int j = 0; j < m-1; j++) {
                int sum = A[i][j] + A[i][j+1] + A[i + 1][j+1];
                tempSum = Math.max(tempSum, sum);
            }
            shape = Math.max(shape, tempSum);
        }

        // 4번 모양
        for (int i = 0; i < n-1; i++) {
            int tempSum = 0;
            for (int j = 1; j < m; j++) {
                int sum = A[i][j] + A[i+1][j] + A[i + 1][j-1];
                tempSum = Math.max(tempSum, sum);
            }
            shape = Math.max(shape, tempSum);
        }
        // 5번 모양
        for (int i = 0; i < n; i++) {
            int tempSum = 0;
            for (int j = 0; j < m-2; j++) {
                int sum = A[i][j] + A[i][j+1] + A[i][j+2];
                tempSum = Math.max(tempSum, sum);
            }
            shape = Math.max(shape, tempSum);
        }
        // 6번 모양
        for (int i = 0; i < n-2; i++) {
            int tempSum = 0;
            for (int j = 0; j < m; j++) {
                int sum = A[i][j] + A[i+1][j] + A[i+2][j];
                tempSum = Math.max(tempSum, sum);
            }
            shape = Math.max(shape, tempSum);
        }

        // 출력
        System.out.println(shape);
    }
}