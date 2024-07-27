import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Info[] infoList = new Info[5];
        for (int i = 0; i < 5; i++){
            String codeName = sc.next();
            int score = sc.nextInt();
            infoList[i] = new Info(codeName, score);
        }

        // sort
        Arrays.sort(infoList);
        // output
        System.out.print(infoList[0].codeName + " " + infoList[0].score);
    }
}

class Info implements Comparable<Info>{
    String codeName;
    int score;
    // no parameter
    public Info(){
        this.codeName = "";
        this.score = 0;
    }
    // existed parameter
    public Info(String codeName, int score){
        this.codeName = codeName;
        this.score = score;
    }

    // 오름차순으로 정렬한다
    @Override
    public int compareTo(Info other) {
        return Integer.compare(this.score, other.score);
    }
}