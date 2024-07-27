import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        // function call
        fun(A, n);
    }
    // 홀수 번째의 원소가 주어질 때마다 지금까지 입력받은 값의 중앙값을 출력
    private static void fun(int[] A, int n){
        int result = 0;
        for (int i = 0; i < n; i++){
            // 홀수 번째 원소
            if (i % 2 == 0) {
                result = printMid(Arrays.copyOfRange(A, 0, i+1));
                // output
                System.out.print(result + " ");
            }
        }
    }
    // 중잉값을 출력
    private static int printMid(int[] A){
        if (A.length <= 1) return A[0];
        // 정렬
        Arrays.sort(A);
        int m = A.length / 2;
        // 중앙값 출력
        return A[m];
    }
}