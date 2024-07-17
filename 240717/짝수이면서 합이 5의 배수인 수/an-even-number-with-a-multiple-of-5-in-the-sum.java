import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 각 자리 수의 합이 5의 배수인지 확인
    public static String check(int n){
        // 짝수인가
        if( n % 2 == 0){
            // 십의 자리수 빼내기
        int ten = n / 10;
        // 일의 자리수 빼내기
        int one = n - 10 * ten;
        // 자리수 합
        int sum = ten + one;

        // check
        if ( sum % 5 == 0){ // 5의 배수인 경우
            return "Yes";
        }
        return "No";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // input
        int n = Integer.parseInt(st.nextToken());
        // function call
        String result = check(n);
        // output
        System.out.println(result);
    }
}