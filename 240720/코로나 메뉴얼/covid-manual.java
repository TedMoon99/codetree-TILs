import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 감기 증상
        String[] coldSymptom = new String[3];
        // 체온
        int[] bodyHeat = new int[3];
        // input
        for (int i = 0; i < 3; i++){
            // 감기 증상
            coldSymptom[i] = sc.next();
            // 체온
            bodyHeat[i] = sc.nextInt();
        }
        // function call
        char result = isEmergency(coldSymptom, bodyHeat);
        // output
        System.out.println(result);
    }
    private static char isEmergency(String[] coldSymptom, int[] bodyHeat){
        boolean isDangerous = isDangerous(coldSymptom, bodyHeat);
        if (isDangerous){ return 'E';}
        return 'N';
    }


    private static boolean isDangerous(String[] coldSymptom, int[] bodyHeat){
        int cnt = 0;
        for (int i = 0; i < 3; i++){
            // A 단계이면 cnt += 1
            if (Objects.equals(coldSymptom[i], "Y") && bodyHeat[i] >= 37){ cnt++; }
            if (cnt >= 2){return true;}
        }
        return false;
    }


}