import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt(), a2 = sc.nextInt(), b1 = sc.nextInt(), b2 = sc.nextInt();
        if (a1 > b1 && a2 > b2) System.out.println(1);
        else System.out.println(0);
    }
}