import java.util.StringTokenizer;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // input
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
        int[] A = new int[]{a, b, c};
        int n = A.length;
        // function call
        sortArr(A, n);
        // output
        System.out.println(A[1]);
    }

    // insertionSort
    private static void sortArr(int[] A, int n){
        // 1 ~ n-1까지 돈다
        for (int i = 1; i < n; i++){
            int j = i-1;
            while(j >=0 && A[j] > A[j+1]){
                // Swap
                int temp = A[j];
                A[j] = A[j+1];
                A[j+1] = temp;
                j--;
            }
        }
    }
}