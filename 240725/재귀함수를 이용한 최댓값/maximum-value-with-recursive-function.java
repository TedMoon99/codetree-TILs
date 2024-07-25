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
        int result = fun(A);
        // output
        System.out.println(result);
    }

    // 최대값 출력
    private static int fun(int[] A){
        // initial condition
        if(A.length <1) return 0;
        else if(A.length == 1) return A[0];
        else if(A.length == 2) return Math.max(A[0], A[1]);

        int m = A.length / 2;
        // 배열을 반으로 쪼개서 각 배열에서의 최대값 중 큰 값을 반환한다
        return Math.max(fun(Arrays.copyOfRange(A, 0, m)), fun(Arrays.copyOfRange(A, m, A.length)));
    }
}