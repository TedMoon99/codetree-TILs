import java.util.Scanner;

public class Main {

    public static String input;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        input = sc.next();

        for(int i = input.length()-1; i >= 0; i--){
            if (i % 2 == 1) System.out.print(input.charAt(i));
        }
    }
}