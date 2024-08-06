import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2차원 배열 사용 
        int[][] square = new int[201][201];
        int n = sc.nextInt();
        Coordinate[] squareStart = new Coordinate[n];
        Coordinate[] squareLast = new Coordinate[n];
        // 입력을 받는다
        for (int i = 0; i< n; i++){
            int x1 = sc.nextInt()+100, y1 = sc.nextInt()+100, x2 = sc.nextInt()+100, y2 = sc.nextInt()+100;
            Coordinate dot1 = new Coordinate(x1, y1);
            Coordinate dot2 = new Coordinate(x2, y2);
            squareStart[i] = dot1;
            squareLast[i] = dot2;
        }
        // 입력 영역 1로 바꾼다
        for(int i = 0; i < n; i++){
            for (int j = squareStart[i].x; j < squareLast[i].x; j++){
                for(int k = squareLast[i].y; k < squareLast[i].y; k++){
                    square[j][k] = 1;
                }
            }
        }
        int s = 0;
        for(int i = 100; i<201; i++){
            for(int j = 100; j < 201; j++){
                if (square[i][j] == 1) s++;
            }
        }
        System.out.println(s);

    }
}

class Coordinate{
    int x, y;

    Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
}