import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(), m = sc.nextInt(), num = 0;
        int[][] A = new int[n][m];

        for(int i = 0; i < m; i++){
            if(i % 2 == 0){ // 위에서 아래로 내려간다
                for (int j = 0; j < n; j++){
                    A[j][i] = num++;
                }
            } else { // 아래에서 위로 올라간다
                for (int j = n-1; j >=0; j--){
                    A[j][i] = num++;
                }
            }
        
        }
        // output
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}