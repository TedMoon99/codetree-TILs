import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        // input
        for (int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }

        // function call
        int[] result = insertion_sort(A);

        // output
        for(int i = 0; i< n; i++){
            System.out.print(result[i] + " ");
        }
    }

    private static int[] insertion_sort(int[] A){
        int size = A.length;
        for (int i = 1; i < size; i++){
            int j = i-1, key = A[i];
            while(j >= 0 && A[j] > key){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = key;
        }
        return A;
    }
}