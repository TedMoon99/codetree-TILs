import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        // 배열 선언
        int[][] A = new int[2][4];
        // input
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                A[i][j] = sc.nextInt();
            }
        }
        // 가로 평균 구하기
        double rowSum = 0;
        for (int i = 0; i < 2; i++){
            for(int num: A[i]){
                rowSum += (double) num;
            }
            System.out.printf("%.1f ", rowSum / 4);
            rowSum = 0;
        }
        System.out.println();

        // 세로 평균 구하기
        double columnSum = 0;
        for (int j = 0; j < 4; j++){
            for (int i = 0; i < 2; i++){
                columnSum += (double) A[i][j];
            }
            System.out.printf("%.1f ", columnSum / 2);
            columnSum = 0;
        }
        System.out.println();

        // 전체 평균 구하기
        double wholeSum = 0;
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 4; j++){
                wholeSum += (double) A[i][j];
            }
        }
        System.out.printf("%.1f", wholeSum / 8);
    }
}