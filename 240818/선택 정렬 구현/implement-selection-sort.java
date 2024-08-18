import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }

        // insertion sort
        for(int i = 0; i< n; i++){
            int min = i;
            for (int j = 0; j < n; j++){
                if (A[min] < A[j]){
                    int temp = A[min];
                    A[min] = A[j];
                    A[j] = temp;
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(A[i] + " ");
        }

    }
}