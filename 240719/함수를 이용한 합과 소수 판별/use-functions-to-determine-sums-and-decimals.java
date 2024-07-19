import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // input
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        // function call
        int result = countEven(a, b);
        // output
        System.out.println(result);
    }

    private static int countEven(int a, int b){
        // a ~ b
        int i, count = 0;
        for (i = a; i <= b; i++){
            if(isPrimeNumber(i) && sumIsEven(i)){
                count += 1;
            }
        }
        return count;
    }
    // 모든 자릿수의 합이 짝수인지를 확인한다
    private static boolean sumIsEven(int x){
        int sum = 0, n = x;
        while(n > 0){
            // 10으로 나눈 나머지. 즉, 마지막 자릿수를 더한다
            sum += n % 10;
            // n을 10으로 나누어준다
            n /= 10;
        }
        // Is Sum Even?
        if (sum % 2 == 0){ return true; }
        return false;
    }

    // 소수인가? 2~ n-1까지의 수로 나누어 떨어지지 않는지를 확인한다
    private static boolean isPrimeNumber(int x){
        // 1인 경우 -> false 
        if (x == 1){ return false; }
        // 2 ~ n-1 확인
        for (int i = 2; i < x; i ++){
            if (x % i == 0){ return false; }
        }
        return true;
    }
}