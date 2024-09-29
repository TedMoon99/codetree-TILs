import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[] DP;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        DP = new int[50];

        // init
        DP[1] = DP[2] = 1;

        System.out.println(fibonacci(n));


    }

    static int fibonacci(int num){
        if (num <=2) return 1;
        if (DP[num] == -1) {
            int result = fibonacci(num-1) + fibonacci(num-2);
            DP[num] = result;
            return result;
        };
        return DP[num];
    }
}