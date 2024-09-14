import java.util.Scanner;

public class Main {
    public static int n, t;
    public static int[] A, B, C;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        t = sc.nextInt();
        A = new int[n];
        B = new int[n];
        C = new int[n];

        // input
        for (int i = 0; i < 3; i++) {
            switch (i){
                case 0:
                    for (int j = 0; j < n; j++) { A[j] = sc.nextInt();}
                    break;
                case 1:
                    for (int j = 0; j < n; j++) { B[j] = sc.nextInt();}
                    break;
                case 2:
                    for (int j = 0; j < n; j++) { C[j] = sc.nextInt();}
                    break;
            }
        }

        for (int i = 0; i < t; i++) {
            int tempStartA = C[n - 1], tempStartB = A[n - 1], tempStartC = B[n - 1];

            for (int j = n-1; j > 0; j--) {
                // A 한칸씩 이동
                A[j] = A[j - 1];
                // B 한칸씩 이동
                B[j] = B[j - 1];
                // C 한칸씩 이동
                C[j] = C[j - 1];
            }
            // 뽑아놓은 값 입력
            A[0] = tempStartA;
            B[0] = tempStartB;
            C[0] = tempStartC;
        }

        // output
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();


    }
}