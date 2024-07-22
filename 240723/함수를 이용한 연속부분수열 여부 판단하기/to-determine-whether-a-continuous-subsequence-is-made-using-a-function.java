import java.util.*;
import java.io.*;

public class Main {
    private static int n1, n2;
    private static int[] A, B;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        A = new int[n1];
        B = new int[n2];
        for (int i = 0; i < n1; i++){
            A[i] = sc.nextInt();
        }
        for (int j = 0; j < n2; j++){
            B[j] = sc.nextInt();
        }
        // 수열 B가 수열 A의 연속부분수열이라면 Yes, 아니라면 No를 출력한다
        String result = isSerialSequence(A, B);
        // output
        System.out.println(result);
    }

    // 수열 B가 수열 A의 연속부분수열이라면 Yes, 아니라면 No를 출력한다
    private static String isSerialSequence(int[] A, int[] B){
        int current = 0;
        int[] resultArr = new int[B.length];

        while (current < A.length - B.length){
            for(int i = 0; i < B.length; i++){
                if (A[current+i] == B[i]) resultArr[i] = A[current+i];
            }
            current++;
        }
        if (Arrays.equals(B, resultArr)) return "Yes";
        return "No";
    }
}