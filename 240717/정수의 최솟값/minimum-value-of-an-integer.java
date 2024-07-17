import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        // input
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        // function call
        int result = findMinimum(a, b, c);
        // output
        System.out.print(result);
    }

    // 최소값 찾기
    public static int findMinimum(int a, int b, int c){
        int middle = Math.min(b, c);
        return Math.min(a, middle);
    }
}