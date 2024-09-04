import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aMath = sc.nextInt(), aEng = sc.nextInt();
        int bMath = sc.nextInt(), bEng = sc.nextInt();

        System.out.println((aMath>bMath && aEng > bEng)? 1: 0);
    }
}