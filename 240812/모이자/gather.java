import java.util.*;

public class Main {
    // 초기값 가능한 큰 값으로 설정
    public static int minSum = 5 * 1000 * 101;
    public static int n;
    public static int[] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        n = sc.nextInt();
        A = new int[n];
        for (int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        // DP
        for(int i = 0; i < n; i++){
            // 이동할 집 = i번째 집(Target)
            int distSum = 0;
            for (int j = 0; j < n; j++){
                // Target과의 이동거리 계산
                int dist = Math.abs(i - j);
                distSum += dist * A[j];
            }
            minSum = Math.min(distSum, minSum);
        }
        // output
        System.out.println(minSum);
    }
}