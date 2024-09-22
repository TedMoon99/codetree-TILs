import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next(), B = sc.next();

        System.out.print((A+B).equals(B+A)? true : false);

    }
}