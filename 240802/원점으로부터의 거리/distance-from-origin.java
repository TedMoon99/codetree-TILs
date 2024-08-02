import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Location[] coordinate = new Location[n];
        // input
        for(int i = 0; i <n; i++){
            int x = sc.nextInt(), y = sc.nextInt();
            Location location = new Location(i+1, x, y);
            coordinate[i] = location;
        }

        // 거리기준 오름차순 정렬
        Arrays.sort(coordinate, new Comparator<Location>(){
           @Override
           public int compare(Location point1, Location point2){
               // 거리가 같은 경우 번호가 작은 점부터 먼저 출력
               if (distance(point1) == distance(point2)) return point1.number - point2.number;
               // 내림차순 정렬
               return distance(point1) - distance(point2);
           }
        });

        // output
        for(int i = 0; i < n; i++){
            System.out.println(coordinate[i].number);
        }
    }

    // 맨하턴 거리 구하는 함수
    private static int distance(Location a){
        return Math.abs(a.x) + Math.abs(a.y);
    }
}

class Location{
    int number, x, y;

    Location(int number, int x, int y){
        this.number = number;
        this.x = x;
        this.y = y;
    }
}