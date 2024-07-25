import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        int n = sc.nextInt();
        // function call
        int result = fun(n);
        // output
        System.out.println(result);

    }

    private static int fun(int n){
        // initial condition
        if(n <=1) return 1;
        return n * fun(n-1);
    }
}