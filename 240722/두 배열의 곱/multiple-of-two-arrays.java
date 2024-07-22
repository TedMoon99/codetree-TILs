import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        // 배열 선언
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int n = 3;

        // input 
        for (int i = 0; i < 2 * n; i++){
            for (int j = 0; j < n; j++){
                if (i >= n){
                    B[i-n][j] = sc.nextInt();
                } else {
                    A[i][j] = sc.nextInt();
                }
            }
        }
        // function call
        printResult(A, B);
    }

    private static void printResult(int[][] A, int[][] B){
        // 배열 선언
        int[][] result = new int[3][3];
        // result 배열 값 할당
        for (int i =0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                result[i][j] = A[i][j] * B[i][j];
            }
        }
        // output
        for (int i =0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}