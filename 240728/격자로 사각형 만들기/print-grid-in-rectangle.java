import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] A = new int[n][n];

        // Set Initial Value
        for (int i = 0; i < n; i++){
            A[i][0] = A[0][i] = 1;
        }

        for(int i = 1; i < n; i++){
            for (int j = 1; j < n; j ++){
                A[i][j] = A[i-1][j-1] + A[i-1][j] + A[i][j-1];
            }
        }

        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j ++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}