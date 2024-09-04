import java.util.*;

public class Main {

    public static int n, m;
    public static int[][] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        A = new int[n][n];
        // input
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                A[i][j] = sc.nextInt();
            }
        }
        int happySeq = 0;
        // 행을 따라서 순회
        for(int i = 0; i< n; i++){
            int currentCount = 0;
            int currentHappy = A[i][0];
            for(int j = 0; j < n; j++){
                // 같으면 cnt + 1
                if (currentHappy == A[i][j]) currentCount++;
                else{
                    currentCount = 1;
                    currentHappy = A[i][j];
                }
            }
            // m보다 카운트가 높다면
            if (currentCount >= m) happySeq++;
        }

        // 열을 따라서 순회
        for(int i = 0; i< n; i++){
            int currentCount = 0;
            int currentHappy = A[0][i];
            for(int j = 0; j < n; j++){
                // 같으면 cnt + 1
                if (currentHappy == A[j][i]) currentCount++;
                else{
                    currentCount = 1;
                    currentHappy = A[j][i];
                }
            }
            // m보다 카운트가 높다면
            if (currentCount >= m) happySeq++;
        }
        // output
        System.out.println(happySeq);


    }

}