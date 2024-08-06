import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] interval = new int[100];
        for (int i = 0; i < n; i++){
            int x1 = sc.nextInt(), x2 = sc.nextInt();
            for(int j = x1; j < x2; j++) interval[j] += 1;
        }
        int max = 0;
        for (int i = 0; i < 100; i++){
            if (interval[i] > max) max = interval[i];
        }

        System.out.print(max);
    }
}