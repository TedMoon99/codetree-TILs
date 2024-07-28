import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] A = new int[n][n];

        // Set initial Value
        for (int i = 0; i < n; i++){
            A[i][0] = 1;
            for (int j = 1; j <= i; j++){
                if (i == j) {
                    A[i][j] = 1;
                    continue;
                }
                A[i][j] = A[i-1][j-1] + A[i-1][j];
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j ++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}