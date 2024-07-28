import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] A = new int[n+1][n+1];
        int num = 1;
        // Set Value
        for (int i = 1; i < m+1; i++){
            int row = sc.nextInt();
            int column = sc.nextInt();

            A[row][column] = num++;
        }
        // output
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < n+1; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}