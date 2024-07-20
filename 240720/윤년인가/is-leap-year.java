import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        int year = sc.nextInt();
        // function call
        boolean result = yoonYear(year);
        // output
        System.out.println(result);
    }

    private static boolean yoonYear(int x){
        if( x % 100 == 0 && x % 400 != 0){ return false;}
        if( x % 4 == 0){ return true;}
        return false;
    }
}