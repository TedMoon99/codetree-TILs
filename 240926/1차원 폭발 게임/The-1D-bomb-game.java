import java.util.*;

public class Main{

    public static int n, m;
    public static int[] A, temp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        A = new int[n];
        temp = new int[n];
        for (int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }

        bomb();

        // output
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] != 0) cnt++;
        }
        System.out.println(cnt);
        for (int i = 0; i < cnt; i++) {
            System.out.print(A[i] + " ");
        }
    }

    // 중력을 적용한다
    static int gravity(){
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] != 0) temp[index++] = A[i];
        }

        int cnt =0;
        for (int i = 0; i < n; i ++){
            if (temp[i] != 0) cnt++;
            A[i] = temp[i];
            temp[i] = 0;
        }
        return cnt;
    }

    // 폭탄 터뜨리기
    static void bomb(){
        int i = 0, size = gravity();
        while(i < size){
            int seqNum = check(i);

            if (seqNum+1 >= m){
                // i ~ removeIndex까지 삭제
                int removeIndex = i + seqNum;
                remove(i, removeIndex);
                size = gravity();
                i = 0;
            } else{
                i++;
            }
        }
    }

    // start ~ end까지 제거
    static void remove(int start, int end){
        for (int i = start; i <= end; i++){
            A[i] = 0;
        }
    }

    // index번째로부터 연속한 숫자를 갖는 폭탄이 몇 개인지 확인
    static int check(int index){
        int i = index, cnt = 0;
        while(i < n-1 && A[i] == A[i+1]){
            cnt++;
            i++;
        }
        return cnt;
    }
}