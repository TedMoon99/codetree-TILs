import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int min = Math.min(a, b);
        min = Math.min(min, c);

        System.out.print((a==min)? 1+" ": 0+ " ");
        int isSame = 0;
        if(a == b && b == c) isSame = 1;
        System.out.println(isSame);
    }
}