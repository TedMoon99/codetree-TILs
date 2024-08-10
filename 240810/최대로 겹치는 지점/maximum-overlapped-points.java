import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Tile[] interval = new Tile[150];
        for (int i = 0; i < interval.length; i++){
            interval[i] = new Tile(i);
        }
        for (int i = 0; i < n; i++){
            int x1 = sc.nextInt(), x2 = sc.nextInt();
            for (int j = x1; j <= x2; j++){
                interval[j].count++;
            }
        }

        int max = 0;
        for (int i = 0; i < interval.length; i++){ 
            if (interval[i].count > max) max = interval[i].count;
        }
        // 출력
        System.out.print(max);
    }
}

class Tile{
    int count = 0, index;
    // 생성자
    Tile(int position){
        this.index = count;
    }
}