import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        
        int first = 11 * 24 * 60 + 11 * 60 + 11;
        int last = a * 24 * 60 + b * 60 + c;
        if(last < first) System.out.println(-1);
        else System.out.println(last-first);
    }
}