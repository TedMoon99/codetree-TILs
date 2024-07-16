import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        // 함수 호출
        printStars(n, m);
    }

    public static void printStars(int n, int m){
        // n번 반복
        for (int i = 0; i < n; i++){
            // m번 반복
            for (int j = 0; j < m; j++){
                System.out.print(1);
            }
            System.out.println();
        }
    }
}