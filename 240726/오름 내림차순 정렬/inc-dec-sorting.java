import java.util.*;

// 다시 풀기(내림차순 생가해보기)
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        // function call
        int[] result1 = fun1(A);
        // output
        for(int i =0; i <result1.length; i++){
            System.out.print(result1[i] + " ");
        }
        System.out.println();

        fun2(A);
    }

    // 오름차순으로 정렬하는 함수
    private static int[] fun1(int[] A){
        Arrays.sort(A);
        return A;
    }

    // 내림차순으로 정렬하는 함수
    private static void fun2(int[] B){
        int[] A = B;
        Arrays.sort(A);
        for (int i = A.length - 1; i > -1; i--){
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}