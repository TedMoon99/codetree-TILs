import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dateList = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dowList = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int m1 =sc.nextInt(), d1 = sc.nextInt(), m2 = sc.nextInt(), d2 = sc.nextInt();
        int first = 0, last = 0, gapOfDate = 0;
        // 날짜 차이 계산
        for (int i = 0; i < m1; i++){
            first += dateList[i];
        }
        for (int i = 0; i < m2; i++){
            last += dateList[i];
        }
        first += d1;
        last += d2;
        gapOfDate = last - first;
        System.out.println(dowList[findDow(gapOfDate)]);

    }

    // 날짜수의 차이를 입력하여 무슨 요일인지 찾는다
    private static int findDow(int gapOfDate){
        while (gapOfDate < 0){
            gapOfDate += 7;
        }
        return gapOfDate % 7;
    }

}