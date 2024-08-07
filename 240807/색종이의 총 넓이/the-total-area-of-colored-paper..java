import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] square = new int[199][199];
        // 색종이 갯수
        int n = sc.nextInt();
        Coordinate[] startList = new Coordinate[n];
        Coordinate[] endList = new Coordinate[n];
        // 좌표 입력 받기
        for (int i = 0; i < n; i++){
            // 좌표 입력
            int x1 = sc.nextInt()+100, y1 = sc.nextInt()+100;
            int x2 = x1 + 8, y2 = y1 + 8;
            // 객체 생성
            Coordinate bottomLeft = new Coordinate(x1, y1);
            Coordinate topRight = new Coordinate(x2, y2);
            // 리스트에 입력
            startList[i] = bottomLeft;
            endList[i] = topRight;
        }
        // 넓이 영역 생성
        for (int s = 0; s < 3; s++){
            // 넓이 영역 계산
            for (int i = startList[s].x; i < endList[s].x; i++){
                for (int j = startList[s].y; j < endList[s].y; j++){
                    square[i][j] = 1;
                }
            }
        }
        // 넓이 영역 계산
        int s = 0;
        for (int i = 0; i < 199; i++){
            for (int j = 0; j < 199; j++){
                if (square[i][j] == 1) s++;
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