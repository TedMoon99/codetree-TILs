import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] square = new int[2001][2001];
        // 시작점
        Coordinate[] startList = new Coordinate[3];
        // 종료점
        Coordinate[] endList = new Coordinate[3];
        for (int i = 0; i < 3; i++){
            // 좌표 입력
            int x1 = sc.nextInt()+1000, y1 = sc.nextInt()+1000, x2 = sc.nextInt()+1000, y2 = sc.nextInt()+1000;
            // 객체 생성
            Coordinate start = new Coordinate(x1, y1);
            Coordinate end = new Coordinate(x2, y2);
            // 리스트에 입력
            startList[i] = start;
            endList[i] = end;
        }
        // 넓이 영역 생성
        for (int s = 0; s < 3; s++){
            // 넓이 영역 계산
            for (int i = startList[s].x; i < endList[s].x; i++){
                for (int j = startList[s].y; j < endList[s].y; j++){
                    square[i][j] = s+1;
                }
            }
        }
        // A: 1, B: 2, M: 3
        // 넓이 영역 계산
        int s = 0;
        for (int i = 0; i < 2001; i++){
            for (int j = 0; j < 2001; j++){
                // 빈 공간이 아님 and M 영역이 아님 s++
                if (square[i][j] > 0 && square[i][j] != 3) s++;
            }
        }
        // 출력
        System.out.print(s);

    }
}

class Coordinate{
    int x, y;
    Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
}