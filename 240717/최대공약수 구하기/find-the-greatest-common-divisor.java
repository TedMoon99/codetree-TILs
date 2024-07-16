import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        // input
        int n = sc.nextInt(), m = sc.nextInt();
        // 함수 호출
        printGcd(n, m);
    }

    public static void printGcd(int n, int m){
        int gcd = 1;
        for (int i =1; i<=n; i++){
            for (int j=1; j<=m; j++){
                // n과 m의 공약수
                if ( n % i == 0 && m % j == 0 && i == j){
                    gcd = i = j;
                }
            }
        }
        System.out.print(gcd);
    }
}