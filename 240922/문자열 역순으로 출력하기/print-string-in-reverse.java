import java.util.Scanner;

public class Main {

    public static String[] arr = new String[4];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }
}