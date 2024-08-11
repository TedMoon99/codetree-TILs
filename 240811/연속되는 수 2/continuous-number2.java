import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n], cntList = new int[n];
        // input
        for( int i = 0; i < n ; i++){
            int num = sc.nextInt();
            A[i] = num;
        }

        int max =0;
        for (int i = 0; i <cntList.length; i++){
            int cnt = 1, j = i;
            while(j == 0 || A[j] == A[j-1]){
                cnt++;
                j++;
            }
            if (max < cnt) max = cnt;
        }

        System.out.println(max);
    }
}