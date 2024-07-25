import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // function call
        int result = fun(n, 0);
        // output
        System.out.println(result);
    }

    private static int fun(int n, int count){
        if (n == 1) return count;
        // n is even
        if (n % 2 == 0) return fun( n/2 , ++count);
        else return fun(3*n+1, ++count);
    }
}