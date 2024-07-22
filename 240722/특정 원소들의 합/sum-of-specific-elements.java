import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        // 배열 선언
        int[][] A = new int[4][4];
        int n = A.length;
        // input
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                A[i][j] = sc.nextInt();
            }
        }
        // function call
        int result = calculateSum(A, n);
        // output
        System.out.println(result);
        
    }
    private static int calculateSum(int[][] A, int n){
        int resultSum = 0;
        for (int i = 0; i < n; i++){
            int j = 0;
            while(j <= i){
                resultSum += A[i][j];
                j++;
            }
        }
        return resultSum;
    }
}