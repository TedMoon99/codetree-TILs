import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        // input
        int n = sc.nextInt();
        int[][] square = new int[n][n];

        int num = 0;
        // make square
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                square[j][i] = ++num;
            }
        }
        // output
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }

    }
}