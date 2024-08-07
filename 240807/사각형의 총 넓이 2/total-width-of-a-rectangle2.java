import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 사각형 갯수 입력
        int n = sc.nextInt();
        int[][] square = new int[201][201];
        // 사각형 시작점
        Coordinate[] coordiStart = new Coordinate[n];
        // 사각형 종료점
        Coordinate[] coordiEnd = new Coordinate[n];
        // 입력을 받음
        for (int i = 0; i < n; i++){
            int x1 = sc.nextInt()+100, y1 = sc.nextInt()+100, x2 = sc.nextInt()+100, y2 = sc.nextInt()+100;
            // 점 객체 생성
            Coordinate start = new Coordinate(x1, y1);
            Coordinate last = new Coordinate(x2, y2);
            // 리스트에 넣어준다
            coordiStart[i] = start;
            coordiEnd[i] = last;
        }
        // n개의 사각형 범위 추가
        for (int i = 0; i < n; i++){
            // x축
            for(int j = coordiStart[i].x; j < coordiEnd[i].x; j++){
                // y축
                for(int k = coordiStart[i].y; k < coordiEnd[i].y; k++){
                    square[j][k] = 1;
                }
            }
        }
        // 넓이 영역 계산
        int s = 0;
        for (int i = 0; i < 201; i++){
            for (int j = 0; j < 201; j++){
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