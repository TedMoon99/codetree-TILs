import java.util.Scanner;

public class Main {

    public static int n, minDiff = 1003 * 502 * 100;
    public static int[] room;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        room = new int[n];
        // input
        for (int i = 0; i < n; i++) {
            room[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            // 거리 계산
            int distSum = 0;
            for (int j = 0; j < n; j++) {
                int dist = (i <= j)? j-i: n-i+j;
                distSum += dist * room[j];
            }

            minDiff = Math.min(minDiff, distSum);
        }

        // output
        System.out.println(minDiff);
    }
}