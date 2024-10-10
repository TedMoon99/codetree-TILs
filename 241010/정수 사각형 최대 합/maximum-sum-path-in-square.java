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
        A = new int[n + 1][n + 1];
        DP = new int[n + 1][n + 1];
        try {
            for (int i = 1; i < n + 1; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <n+1; j++) {
                    A[i][j] = Integer.parseInt(st.nextToken());
                }
            }
        } catch (Exception e) { e.printStackTrace(); }

        // DP[i][j] = A[i][j] + Max(DP[i-1][j], DP[i-1][j-1])

        int max = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                DP[i][j] = A[i][j] + Math.max(DP[i - 1][j], DP[i][j - 1]);
                max = Math.max(DP[i][j], max);
            }
        }

        System.out.println(max);
    }
}