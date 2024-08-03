import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dateList = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dowList = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        // input
        int m1 =sc.nextInt(), d1 = sc.nextInt(), m2 = sc.nextInt(), d2 = sc.nextInt();
        String target = sc.next();

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

        // m1월 d1일의 요일 == m2월 d2일의 요일 == target
        if (target.equals("Mon")){
            if (dowList[findDow(gapOfDate)].equals(target)){ // 시작과 끝이 해당
                System.out.println(findWeekNumber(gapOfDate)+2);
            } else { // 끝만 해당
                System.out.println(findWeekNumber(gapOfDate)+1);
            }
        } else {
            if (dowList[findDow(gapOfDate)].equals(target)){ // 끝만 해당
                System.out.println(findWeekNumber(gapOfDate)+1);
            } else { //시작과 끝 둘 다 해당 X
                System.out.println(findWeekNumber(gapOfDate));
            }
        }
    }

    // 날짜수의 차이를 입력하여 무슨 요일인지 찾는다
    private static int findDow(int gapOfDate){
        while (gapOfDate < 0){
            gapOfDate += 7;
        }
        return gapOfDate % 7;
    }
    // 날짜수의 차이를 입력하여 몇 주의 차이가 나는지 찾는다
    private static int findWeekNumber(int gapOfDate){
        int count = 0;
        while (gapOfDate > 6){
            count++;
            gapOfDate -= 7;
        }
        return count;
    }

}