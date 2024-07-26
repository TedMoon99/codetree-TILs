import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[2 * n];
        for (int i = 0; i < 2*n; i++){
            A[i] = sc.nextInt();
        }
        // function call
        int result = fun(A, n);
        // output
        System.out.println(result);
    }

    // 각 그룹의 원소의 합의 최대값이 가장 작아질 수 있도록 N개의 그룹을 적절히 만들었을 때의 최댓값을 반환한다
    private static int fun(int[] A, int n){
        int maxSum = 0;
        // 오름차순 정렬
        Arrays.sort(A);
        for(int i = 0; i < n; i++){
            // 양 끝 값을 더한다
            int sum = A[i] + A[2*n-1-i];
            if (maxSum < sum) maxSum = sum;
        }
        return maxSum;
    }
}