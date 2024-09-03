import java.util.*;

public class Main {

    public static int n;
    public static int[][] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        n = sc.nextInt();
        A = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j =0; j < n; j++){
                A[i][j] = sc.nextInt();
            }
        }
        // function
        int maxCnt = 0;
        for (int i = 0; i < n-2; i++){
            for (int j = 0; j < n-2; j++){
                int cnt = 0;
                for (int k = i; k < i+3; k++){
                    for(int l= j; l < j+3; l++){
                        if (A[k][l] == 1) cnt++;
                    }
                }
                maxCnt = Math.max(maxCnt, cnt);
            }
        }

        System.out.println(maxCnt);

    }
}