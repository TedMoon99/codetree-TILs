import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[][] A = new int[n][n];

        for (int i = 0; i < n; i++){
            A[0][i] = 1;
            A[i][0] = 1;
        }

        for (int i = 1; i < n; i++){
            for (int j = 1; j < n; j++){
                A[i][j] = A[i-1][j]+ A[i][j-1];
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}