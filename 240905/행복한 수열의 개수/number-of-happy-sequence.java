import java.util.Scanner;

public class Main {

    public static int n, m;
    public static int[][] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        A = new int[n][n];
        int happyCnt = 0;
        // input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        // 행을 따라 조회
        for (int i = 0; i < n; i++) {
            // 갯수를 찾는다
            int currentCnt = 0;
            // 시작 수열
            int currentHappy = A[i][0];
            for (int j = 0; j < n; j++) {
                // 이전의 값과 같다면
                if (currentHappy == A[i][j]) currentCnt++;
                // 다르다면
                else {
                    currentCnt = 1;
                    currentHappy = A[i][j];
                }

                // 연속하여 m개 이상의 동일한 원소가 나오는 순간이 존재한다면
                if (currentCnt >= m){
                    happyCnt++;
                    break;
                }
            }
        }
        // 열을 따라 조회
        for (int i = 0; i < n; i++) {
            // 갯수를 찾는다
            int currentCnt = 0;
            // 시작 수열
            int currentHappy = A[0][i];
            for (int j = 0; j < n; j++) {
                // 이전의 값과 같다면
                if (currentHappy == A[j][i]) currentCnt++;
                // 다르다면
                else {
                    currentCnt = 1;
                    currentHappy = A[j][i];
                }

                // 연속하여 m개 이상의 동일한 원소가 나오는 순간이 존재한다면
                if (currentCnt >= m){
                    happyCnt++;
                    break;
                }
            }
        }
        // output
        System.out.println(happyCnt);
    }
}