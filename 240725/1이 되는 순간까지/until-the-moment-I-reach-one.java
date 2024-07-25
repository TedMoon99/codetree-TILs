import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        int n = sc.nextInt();
        // function call
        int result = untilOne(n, 0);
        // output
        System.out.println(result);
    }

    private static int untilOne(int n, int count){
        // 1이 되면 멈춘다
        if(n == 1) return count;
        if (n % 2 == 0) return untilOne(n/2, ++count);
        else return untilOne(n/3, ++count);
    }
}