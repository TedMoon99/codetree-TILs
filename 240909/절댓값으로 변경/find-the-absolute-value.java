import java.util.Scanner;




public class Main {

    private static void absCover(int[]  A) {
        int size = A.length;
        for (int i = 0; i < size; i++) {
            A[i] = (A[i] < 0)? -A[i]: A[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        absCover(A);

        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

    }
}