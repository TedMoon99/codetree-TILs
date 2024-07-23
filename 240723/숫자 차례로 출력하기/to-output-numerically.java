import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        int n = sc.nextInt();
        // function call
        printStar1(n);
        System.out.println();
        printStar2(n);
    }

    // 1 ~ N까지 숫자를 차례대로 출력
    private static void printStar1(int n){
        // 종료 조건
        if (n == 0) return;
        printStar1(n-1);
        System.out.print(n + " ");
    }

    // N ~ 1까지 숫자를 차례대로 출력 
    private static void printStar2(int n){
        // 종료 조건
        if (n == 0) return;
        System.out.print(n + " ");
        printStar2(n-1);
    }
}