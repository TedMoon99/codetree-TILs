import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt(), weight = sc.nextInt();
        int b = (10000 * weight) / (height * height);

        System.out.println((int) b);
        if ( b >= 25) System.out.println("Obesity");
    }
}