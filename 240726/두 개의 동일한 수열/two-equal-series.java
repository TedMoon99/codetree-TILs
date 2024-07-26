import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            B[i] = sc.nextInt();
        }
        // function call
        String result = fun(A, B, n);
        // output
        System.out.println(result);

    }

    private static String fun(int[] A, int[] B, int n){
        // 오름차순 sort
        Arrays.sort(A);
        Arrays.sort(B);
        // 둘이 같은가?
        for (int i = 0; i < n; i++){
            if (A[i] != B[i]) return "No";
        }
        return "Yes";
    }
}