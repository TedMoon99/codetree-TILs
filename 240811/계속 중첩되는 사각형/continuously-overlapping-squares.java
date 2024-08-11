import java.util.*;

public class Main {
    public static final int MAX_R = 200, MAX_C = 200;
    public static final int OFFSET = 100;
    public static int[][] space;
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        space = new int[MAX_R+1][MAX_C+1];

        n = sc.nextInt();
        for (int i = 0; i < n; i++){
            // 빨(2) -> 파(1) -> 빨(2) -> 파(1) -> 순으로 주어지는 사각형
            int x1 = sc.nextInt()+OFFSET, y1 = sc.nextInt()+OFFSET, x2 = sc.nextInt()+OFFSET, y2 = sc.nextInt()+OFFSET;
            for (int y = y1; y < y2; y++){
                for (int x = x1; x < x2; x++){
                    space[y][x] = (i+2) % 2;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < space.length; i++){
            for (int j = 0; j < space[i].length; j++){
                if (space[i][j] == 1) count++;
            }

        }

        System.out.println(count);
    }
}