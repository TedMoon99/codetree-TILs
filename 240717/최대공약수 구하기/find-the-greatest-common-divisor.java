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
        if(n <= m){
            for(int i = 1; i <=n; i++){
                if(n % i == 0 && m %i == 0){
                    gcd = i;
                }
            }
        } else {
            for(int i = 1; i <=m; i++){
                if(n % i == 0 && m %i == 0){
                    gcd = i;
                }
            }
        }
        System.out.print(gcd);
    }
}