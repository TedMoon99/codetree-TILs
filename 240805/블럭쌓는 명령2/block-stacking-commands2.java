import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        // 전체 초기화된 배열 생성
        int[] interval = new int[n];
        // k-times
        for(int i = 0; i < k; i++){
            int from = sc.nextInt(), to = sc.nextInt();
            // from ~ to +1
            for (int j = from-1; j < to; j++){
                interval[j] += 1;
            }
        }
        // 출력한다
        System.out.print(Arrays.stream(interval).max().getAsInt());

    }
}