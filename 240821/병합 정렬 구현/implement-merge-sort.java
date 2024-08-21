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
        merge_sort(A, 0, A.length-1);

        //output
        for (int i = 0; i < n; i++){
            System.out.print(A[i] + " ");
        }
    }

    private static void merge_sort(int[] A, int low, int high){
        if (low < high){
            int mid = (low + high) / 2;
            merge_sort(A, low, mid);
            merge_sort(A, mid+1, high);
            merge(A, low, mid, high);
        }
    }

    private static int[] merge(int[] A, int low, int mid, int high){
        int[] result = new int[high+1];
        int i = low, j = mid+1, k = low;
        while ( i <= mid && j <= high){
            result[k++] = (A[i] <= A[j])? A[i++] : A[j++];
        }
        while (i <= mid){
            result[k++] = A[i++];
        }
        
        while (j <= high){
            result[k++] = A[j++];
        }
        for (int t = low; t <= high; t++){
            A[t] = result[t];
        }
        
        return  A;
    }

}