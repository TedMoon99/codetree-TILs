import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // function call
        printStar(n);
    }

    private static void printStar(int n){
        // 종료 조건
        if (n < 1) return;
        for(int i = 0; i < n; i ++){
            System.out.print("* ");
        }
        System.out.println();
        printStar(n-1);
        for(int i = 0; i < n; i ++){
            System.out.print("* ");
        }
        System.out.println();
    }
}