import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        // input
        int n = sc.nextInt(), m = sc.nextInt();
        // 배열 선언
        int[][] A = new int[n][m];
        int[][] B = new int[n][m];
        // 값 할당
        for (int i = 0; i <2*n; i++){
            for (int j = 0; j < m; j++){
                if(i >= n){
                    B[i-n][j] = sc.nextInt();
                } else {
                    A[i][j] = sc.nextInt();
                }
            }
        }
        // function call
        printResult(A, B, n, m);
    }

    private static void printResult(int[][] A, int[][] B, int n, int m){
        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                // 조건이 true이면 0을, false이면 1을 할당
                result[i][j] = (A[i][j] == B[i][j]) ? 0 : 1;
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}