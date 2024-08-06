import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] interval = new int[201];
        for (int i = 0; i < n; i++){
            int x1 = sc.nextInt() + 100, x2 = sc.nextInt() + 100;
            for(int j = x1; j < x2; j++) interval[j] += 1;
        }
        int max = 0;
        for (int i = 100; i < interval.length; i++){ // 100 ~ 200 확인
            if (interval[i] > max) max++;
        }
        // 출력
        System.out.print(max);
    }
}