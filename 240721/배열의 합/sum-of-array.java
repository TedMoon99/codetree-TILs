import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException{
        // Scanner
        Scanner sc = new Scanner(System.in);
        // 배열 선언

        int[][] arr2d = new int[4][4];

        for (int i = 0; i <4; i++){
            for(int j = 0; j <4; j++){
                arr2d[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <4; i++){
            int sum = 0;
            for(int j = 0; j <4; j++){
                sum += arr2d[i][j];
            }
            System.out.println(sum);
        }
    }
}