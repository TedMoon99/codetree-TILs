import java.util.*;

public class Main {
    static int n;
    static int[] A, temp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        n = sc.nextInt();
        A = new int[n+1];
        temp = new int[n+1];

        // input 
        for (int i = 1; i < n+1; i++){
            A[i] = sc.nextInt();
        }


        // function call
        for (int i = 0; i < 2; i++){
            int s = sc.nextInt(), e = sc.nextInt();

            // 뺀다
            remove(s, e);
        }

        // output
        int cnt = 0;
        for (int i = 1; i < n+1; i++){
            if (A[i] != 0) cnt++;
        }
        System.out.println(cnt);
        for (int i = 1; i < n+1; i++) {
            if (A[i] == 0) break;
            System.out.println(A[i]);
        }
    }


    // 특정 구간의 블럭들을 뺀다
    static void remove(int start, int end){
        int index = 1;
        for (int i = 1; i < n+1; i++){
            // start ~ end 구간에 없는 경우
            if (i < start || i > end) temp[index++] = A[i];
        }

        // temp -> A에 주입
        for (int i = 1; i < n+1; i++){
            A[i] = temp[i];
            // 요소 초기화
            temp[i] = 0;
        }
    }
}