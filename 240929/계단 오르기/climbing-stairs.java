import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static final int mod = 10007;
    static int[] DP;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        DP = new int[n+10];

        DP[0]=1;
        DP[1]=0;
        System.out.println(upStair(n));
    }

    static int upStair(int num){
        if (num < 0) return 0;
        if (DP[num] == 0){
            int result = (upStair(num - 2) + upStair(num-3)) % mod;
            DP[num] = result;
            return result;
        }
        return DP[num];
    }
}