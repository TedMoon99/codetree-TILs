import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Score[] scoreList = new Score[n];
        // input 
        for(int i = 0; i < n; i++){
            String name = sc.next();
            int korean = sc.nextInt(), english = sc.nextInt(), math = sc.nextInt();

            Score data = new Score(name, korean, english, math, korean+english+math);
            scoreList[i] = data;
        }
        // function call
        Arrays.sort(scoreList);

        //output
        for(int i = 0; i < n; i++){
            System.out.printf("%s %d %d %d\n", scoreList[i].name, scoreList[i].korean, scoreList[i].english, scoreList[i].math);
        }
    
    }
}

class Score implements Comparable<Score>{
    String name;
    int korean, english, math, sum;

    public Score(String name, int korean, int english, int math, int sum){
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
        this.sum = sum;
    }

    @Override
    public int compareTo(Score other){
        return this.sum - other.sum;   
    }
}