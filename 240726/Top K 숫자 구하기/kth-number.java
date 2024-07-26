import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        Integer[] A = new Integer[n];
        for (int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        // sort
        Arrays.sort(A, Collections.reverseOrder());
        // output
        for (int i = 0; i < A.length; i++){
            if (i == k-1) System.out.println(A[i]);
        }
    }
}