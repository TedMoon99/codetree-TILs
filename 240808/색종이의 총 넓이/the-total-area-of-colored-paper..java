import java.util.*;

public class Main {
    public static final int MAX_N = 200;
    public static final int MAX_R = 200;
    public static final int OFFSET = 100;

    public static int n;
    public static int[] x1 = new int[MAX_N];
    public static int[] y1 = new int[MAX_N];
    public static int[] x2 = new int[MAX_R];
    public static int[] y2 = new int[MAX_R];


    public static int[][] checked = new int[MAX_R+1][MAX_N+1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            x1[i] = sc.nextInt() + OFFSET;
            y1[i] = sc.nextInt() + OFFSET;
            x2[i] = x1[i] + 8;
            y2[i] = y1[i] + 8;
        }

        // 직사각형을 칠해줍니다
        // 격자 단위로 진행하는 문제이므로
        // x2, y2에 등호가 들어가지 않음에 유의한다
        for (int i = 0; i < n; i++)
            for (int x = x1[i]; x < x2[i]; x++)
                for (int y = y1[i]; y < y2[i]; y++)
                    checked[x][y] = 1;
        int area = 0;
        for (int x = 0; x <= MAX_R; x++){
            for (int y = 0; y <= MAX_N; y++){
                if (checked[x][y] == 1) area++;
            }
        }
        // output
        System.out.print(area);
    }
}