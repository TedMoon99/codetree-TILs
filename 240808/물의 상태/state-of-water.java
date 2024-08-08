import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) System.out.print("ice");
        else if ( n < 100) System.out.print("water");
        else System.out.print("water");
    }
}