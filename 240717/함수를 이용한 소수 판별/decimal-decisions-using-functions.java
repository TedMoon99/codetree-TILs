import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*
정수 a와 b가 주어지면, a이상 b이하 소수들의 합을 구해주는 프로그램을 작성해보세요. 단, 함수를 이용하여 문제를 해결해주세요.
 */
public class Main {

    private static boolean isPrime(int n){
        // 숫자 2 ~ n-1까지 숫자들 중 단 하나라도 나누어 떨어지는 지를 확인
        for (int j = 2; j < n; j++){
            if ( n % j == 0){ return false; }
        }
        return true;
    }


    private static int sumPrime(int a, int b){
        int sum = 0;
        // 둘 다 1인 경우
        if (a == 1 && b == 1){
            return 0;
        }

        for (int i = a; i <=b; i++){
            if (isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }


    public static void main(String[] args) throws IOException {
        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // input
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        // function call
        int result = sumPrime(a, b);
        // output
        System.out.println(result);
    }
}