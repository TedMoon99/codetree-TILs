import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();
        while(a <= b){
            if (a % 2 == 0) System.out.print(a + " ");
            a++;
        }

    }
}