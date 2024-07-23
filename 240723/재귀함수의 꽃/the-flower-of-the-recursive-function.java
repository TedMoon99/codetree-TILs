import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // function call
        printNumber(n);

    }

    // N ~ 1까지 감소하며 하나씩 출력 했다가 1 ~ N까지 증가하면서 출력
    private static void printNumber(int n){
        // 종료 조건
        if(n < 1) return;

        System.out.print(n + " ");
        printNumber(n-1);
        System.out.print(n + " ");
    }
}