import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dateList = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int m1 = sc.nextInt(), d1 = sc.nextInt(), m2 = sc.nextInt(), d2 = sc.nextInt();
        int start = 0, last=0;
        for(int i = 0; i < m1; i++){
            start += dateList[i];
        }
        for(int j=0; j < m2; j++){
            last += dateList[j];
        }
        start += d1;
        last += d2;

        System.out.println(last-start);
    }
}