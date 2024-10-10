import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[][] A, DP;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        A = new int[n + 1][n + 2];
        DP = new int[n + 1][n + 2];

        try {

            for (int i = 1; i < n + 1; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j < n + 1; j++) {
                    A[i][j] = Integer.parseInt(st.nextToken());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = n; j > 0; j--) {
                int up = DP[i-1][j], right = DP[i][j+1];
                if (up == 0 && j != n) {
                    DP[i][j] = A[i][j] + DP[i][j + 1];
                } else if (j == n) {
                    DP[i][j] = A[i][j] + DP[i - 1][j];
                } else{
                    DP[i][j] = A[i][j] + Math.min(up, right);
                }
            }
        }
        
        System.out.println(DP[n][1]);
    }
}