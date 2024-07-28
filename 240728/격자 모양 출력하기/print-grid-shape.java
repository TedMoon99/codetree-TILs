import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int[][] A = new int[n+1][n+1];
        for (int i = 0; i < m; i++){
            int row = sc.nextInt(), column = sc.nextInt();
            A[row][column] = row * column;
        }

        for(int i = 1; i <= n; i++){
            for (int j = 1; j <=n; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}