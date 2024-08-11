import java.util.*;

public class Main {
    public static final int MAX_R = 1000 * 100;
    public static int n, current;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 배열 생성
        int[] space = new int[2 * MAX_R + 1];
        current = space.length / 2; // 현재 포인트 생성
        n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);

            if (dir == 'L'){ // 왼쪽인 경우 => 흰색(White)으로 바뀜
                for (int j = current; j > current-x; j--){
                    space[j] = 'W';
                }

                // 마지막 위치 설정
                current = current-x+1;
            } else{ // 오른쪽인 경우 => 검정색(Black)으로 바뀜
                for (int j = current; j < current+x; j++){
                    space[j] = 'B';
                }
                // 마지막 위치 설정
                current = current+x-1;
            }
        }
        int white = 0, black = 0;
        for(int i = 0; i < space.length; i++){
            if (space[i] == 'W') white++;
            else if (space[i] =='B') black++;
        }


        // ouput
        System.out.printf("%d %d", white, black);
    }
}