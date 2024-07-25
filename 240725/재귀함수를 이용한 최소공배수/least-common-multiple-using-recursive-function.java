import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        // functino call
        int result = fun(A);
        // output
        System.out.println(result);
    }

    // 주어진 수들의 최소공배수(lcd)를 찾는 함수
    private static int fun(int[] A){
        if (A.length == 1) return A[0];
        int m = A.length / 2;
        return findLcd(fun(Arrays.copyOfRange(A, 0, m)), fun(Arrays.copyOfRange(A, m, A.length)));

    }

    // 두 수의 최소 공배수를 반환하는 함수
    private static int findLcd(int a, int b){
        int min = Math.min(a, b), max = Math.max(a, b);
        while(min < a * b){
            if(min % a == 0 && min % b == 0) return min;
            min++;
        }
        return a * b;
    }
}