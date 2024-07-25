import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        int n = sc.nextInt();
        // function call
        int result = sequenceFun(n);
        // output
        System.out.println(result);
    }

    private static int sequenceFun(int n){
        if (n == 1) return 1;
        if (n == 2) return 1;
        return sequenceFun(n-1) + sequenceFun(n-2);
    }
}