import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        // input
        int n = sc.nextInt(), m = sc.nextInt();
        // 함수 호출
        int lcd = printLcd(n,m);
        //output
        System.out.println(lcd);
    }

    // 최소 공배수 출력
    public static int printLcd(int n, int m){
        int big = Math.max(n, m);
        int min = Math.max(n, m);
        // n과 m 둘 중 하나가 최소공배수인 경우
        if (n > m && big % m == 0){ return big; }
        else if (n < m && big % n == 0){ return big; }
        // 둘 중 하나가 최소 공배수가 아닌 경우
        int i = big;
        while(i <= n * m){
            if (i % n == 0 && i % m == 0){ return i; }
            i++;
        }
        return n * m;
    }
}