import java.util.*;

public class Main {
    public static int[] countList;
    public static int current;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Tile> space = new ArrayList<Tile>(100000);
        for(int i = 0; i < 100000; i++){
            Tile data = new Tile(i);
            space.add(data);
        }
        current = space.size() / 2;

        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);

            if (dir == 'L'){ // 왼쪽으로 이동(White)
                for (int j = current; j > current - x; j--){
                    char color = (space.get(j).checkColor())? 'G': 'W';
                    space.get(j).makeCount(color);
                    space.get(j).color = (space.get(j).checkColor())? 'G': 'W';
                }
                // 마지막 위치 저장
                current = current-x+1;
            } else if (dir == 'R'){ // 오른쪽으로 이동(Black)
                for (int j = current; j < current + x; j++){
                    char color = (space.get(j).checkColor())? 'G': 'B';
                    space.get(j).makeCount(color);
                    space.get(j).color = (space.get(j).checkColor())? 'G': 'B';
                }
                // 마지막 위치 저장
                current = current+x-1;
            }
        }

        int white = 0, black = 0, grey = 0;
        for (int i = 0; i < space.size(); i++){
            char index = space.get(i).color;

            if (index == 'W'){
                white++;
            } else if(index == 'B'){
                black++;
            } else if(index == 'G'){
                grey++;
            }
        }

        System.out.printf("%d %d %d", white, black, grey);
    }
}

// Tile 한 칸에 해당하는 객체 생성
// 필요한 정보 : 1) 인덱스 정보 2)
class Tile{
    int whiteCount = 0, blackCount = 0, index;
    char color;
    // 초기 배열 선언 시 사용
    Tile(){
    }
    // index 정보를 담고있음
    Tile(int position){
        this.index = position;
    }

    // 들어온 색상이 무엇인지에 따라 count 증가
    public void makeCount(char color){
        if (color == 'W') this.whiteCount++;
        else if (color == 'B') this.blackCount++;
    }

    // 모두 2번 이상 칠해졌는지 확인 => 칠해진 경우 true 반환
    public boolean checkColor(){
        return this.whiteCount >= 2 && this.blackCount >= 2;
    }
}