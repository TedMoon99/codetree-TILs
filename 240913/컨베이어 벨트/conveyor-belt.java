import java.util.Scanner;

public class Main {
    public static int n, t;
    public static int[][] A;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        t = sc.nextInt();
        A = new int[2][n];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0){
                    A[i][j] = sc.nextInt();
                }else {
                    A[i][n-1-j] = sc.nextInt();
                }
            }
        }

        // t번 반복한다
        for (int i = 0; i < t; i++) {
            int tempStart= A[1][0], tempLast = A[0][n-1];

            // 한칸씩 옮긴다
            for (int j = n-1; j > 0; j--) {
                A[0][j] = A[0][j - 1];
            }
            for (int j = 0; j < n-1; j++) {
                A[1][j] = A[1][j + 1];
            }
            A[0][0] = tempStart;
            A[1][n - 1] = tempLast;
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((i==0)? A[i][j] + " ": A[i][n-1-j] + " ");
            }
            System.out.println();
        }
    }
}