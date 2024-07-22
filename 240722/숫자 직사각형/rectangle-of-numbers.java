import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // input ( n = row 갯수, m = column 갯수 )
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        // function call
        printResult(n, m);
    }
    private static void printResult(int n, int m){
        // 배열 선언
        int[][] A = new int[n][m];
        int num = 1;
        // 배열에 값 저장
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                A[i][j] = num;
                num++;
            }
        }
        // output
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}