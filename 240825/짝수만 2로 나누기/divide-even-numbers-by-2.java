import java.util.*;

public class Main {
    public static int[] A;
    public static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        A = new int[n];
        for (int i = 0; i < n; i++){
            A[i] = sc.nextInt();
            if (A[i] % 2 == 0)
                divider(A, i);
            
        }
        for (int i = 0; i < n; i++){
            System.out.print(A[i] + " ");
        }

    }

    private static void divider(int[] A, int num){
        A[num] /= 2;
    }
}