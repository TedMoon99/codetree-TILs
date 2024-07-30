import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // nextInt() 메서드가 정수 입력을 받은 뒤에 new Line('\n')을 남겨두기 때문에 이를 제거해줘야 함
        Health[] healthList = new Health[n];
        // input
        for (int i = 0; i < n ; i++){
            String[] input = sc.nextLine().split(" ");
            Health health = new Health(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2]));
            healthList[i] = health;
        }
        // function call
        Arrays.sort(healthList);
        // output
        for(int i = 0; i < n; i++){
            System.out.printf("%s %d %d\n", healthList[i].name, healthList[i].height, healthList[i].weight);
        }
    }
}

class Health implements Comparable<Health>{
    String name;
    int height;
    int weight;

    public Health(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // 키를 기준으로 오름차순으로 정렬한다
    @Override
    public int compareTo(Health health){
        return this.height - health.height;
    }
}