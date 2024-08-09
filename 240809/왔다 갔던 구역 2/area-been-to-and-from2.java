import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 움직일 공간
        int[] space = new int[2000 + 1];
        // 현재 위치
        int current = 1001; // 1001을 위치 0으로 간주
        // n번 명령을 받는다
        for (int i = 0; i < n; i++){
            // 이동 거리
            int dist = sc.nextInt();
            // 방향
            char dir = sc.next().charAt(0);

            if (dir == 'L'){ // 왼쪽으로 이동
                int next = current - dist;
                for (int j = next; j < current; j++){
                    space[j]++;
                }
                // 이동한 곳을 다음 현재 위치로 바꿔준다
                current = next;

            } else if (dir == 'R'){ // 오른쪽으로 이동
                int next = current + dist;
                for (int j = current; j < next; j++){
                    space[j]++;
                }
                // 이동한 곳을 다음 현재 위치로 바꿔준다
                current = next;
            } else {
                System.out.print("잘못된 입력입니다.");
            }
        }
        // 두 번 이상 지나간 곳을 찾는다
        int count = 0;
        for(int i = 0; i < space.length; i++){
            if (space[i] >= 2) count++;
        }

        // output
        System.out.print(count);
    }
}