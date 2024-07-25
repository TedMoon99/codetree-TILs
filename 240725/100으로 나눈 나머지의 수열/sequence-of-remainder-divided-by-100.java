import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // function call
        int result = fun(n);
        // output
        System.out.println(result);
    }

    private static int fun(int n){
        if (n == 1) return 2;
        if (n == 2) return 4;
        return (fun(n-1) * fun(n-2)) % 100;
    }
}