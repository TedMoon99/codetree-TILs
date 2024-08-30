import java.util.*;
public class Main {
    public static int n;
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (arr[i] <= arr[j] && arr[j] <= arr[k]) count++;
                }
            }
        }
        System.out.println(count);
    }
}