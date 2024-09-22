import java.util.Scanner;

public class Main {

    public static int n, length=0, cnt=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n ; i++){
            String input = sc.next();
            length += input.length();
            if (input.charAt(0) == 'a') cnt++;
        }

        System.out.print(length + " " + cnt);
    }
}