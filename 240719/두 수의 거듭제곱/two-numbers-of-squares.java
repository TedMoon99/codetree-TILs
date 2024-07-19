import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.InputStreamReader;

public class Main {
    // a^b를 계산한다
    private static int calculateSquare(int a, int b){
        if (b == 1){ return a; } // 제곱수가 1인 경우 
        if (a == 1){ return 1; } // 피제곱수가 1인 경우 
        // a, b 둘 다 1이 아닌 경우
        int result = 1;
        for(int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // input
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        // function call
        int result = calculateSquare(a, b);
        // output
        System.out.println(result);
    }
}