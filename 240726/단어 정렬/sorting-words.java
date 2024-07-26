import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];
        // input
        for(int i = 0; i < n; i++){
            str[i] = sc.next();
        }
        // function call
        fun(str);
    }

    private static void fun(String[] A){
        Arrays.sort(A); // 정렬한다
        // 출력한다
        for(int i = 0; i < A.length; i++){
            System.out.println(A[i]);
        }
    }
}