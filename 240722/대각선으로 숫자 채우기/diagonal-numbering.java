import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // input
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        // function call
        makeSquare(n, m);
    }

    private static void makeSquare(int n, int m){
        // n : row Size, m : column Size
        // 배열 선언
        int[][] square = new int[n][m];
        // value Asignment
        int i = 0, num = 1;
        while(i < m){ // 반복 횟수 : i 
            // j : row , c : column;
            int j = 0, c = i;
            // 아래 벽에 닿거나 왼쪽 벽에 닿을 때까지 반복
            while(j < n && c-1 >= -1){
                square[j][c] = num;
                num++;
                j++;
                c--;
            }
            i++;
        }
        // 아래 벽에 닿아서 나온 경우(j = n-1 and i = m )
        int r = 0;
        while(r != n-1){ // 오른쪽 아래에 갈 때까지 반복
            int j = r+1, c = m-1;
            while(j < n){ // 아래에 닿을 때까지 반복
                square[j][c] = num;
                num++;
                j++;
                c--;
            }
            r++;
        }

        // output
        for(int p = 0; p < n; p++){
            for (int q = 0; q < m; q++){
                System.out.print(square[p][q] + " ");
            }
            System.out.println();
        }
    }
}