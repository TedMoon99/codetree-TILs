import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] DP;
    static final int divider = 10007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        DP = new int[n+1];

        DP[1] = 1;
        DP[2] = 2;
        DP[3] = 3;
        makeDP();

        System.out.println(DP[n]);
    }

    static void makeDP() {
        for (int i = 4; i < n + 1; i++) {
            DP[i] = (DP[i - 1] + DP[i - 2]) % divider;
        }
    }


}