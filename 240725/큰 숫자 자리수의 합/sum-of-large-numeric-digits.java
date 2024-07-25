import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        // function call
        int result = fun(a*b*c);
        // output
        System.out.println(result);
    }

    // 세 숫자들을 곱한 후, 그 결과값의 각 자리 숫자들의 합을 출력한다
    private static int fun(int n){
        // initial condition
        if (n < 10) return n;
        return n % 10 + fun(n / 10); 

    }
}