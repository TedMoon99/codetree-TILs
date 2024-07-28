import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] A = new int[n][n];
        // function call
            // n is even
        if (n % 2 == 0) evenFun(A, n);
            // n is odd 
        else oddFun(A, n);

        // output
        for (int i = 0; i < n; i++){
            for (int j=0; j < n; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    // n is even
    private static void evenFun(int[][] A, int n){
        int num = 0;
        for (int i = n-1; i >= 0; i--){
            if (i % 2 == 1){ // 홀수번째 -> 위로 올라간다 
                for (int j = n-1; j >= 0; j--){
                    A[j][i] = ++num;
                }
            } else { // 짝수 번째 -> 아래로 내려간다
                for (int j = 0; j < n; j++){
                    A[j][i] = ++ num;
                }
            }
        }
    }

    // n is odd
    private static void oddFun(int[][] A, int n){
        int num = 0;
        for (int i = n-1; i >= 0; i--){
            if (i % 2 == 0){ // 짝수 번째 -> 위로 올라간다
                for (int j = n-1; j >= 0; j--){
                    A[j][i] = ++num;
                }
            } else { // 홀수 번째 -> 아래로 내려간다
                for (int j = 0; j < n; j++){
                    A[j][i] = ++num;
                }
            }
        }
    }
}