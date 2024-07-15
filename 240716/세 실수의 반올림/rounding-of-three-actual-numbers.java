import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        
        System.out.printf("%.3f\n", Math.round(a * 1000.0) / 1000.0);
        System.out.printf("%.3f\n", Math.round(b * 1000.0) / 1000.0);
        System.out.printf("%.3f\n", Math.round(c * 1000.0) / 1000.0);
    
    }
}