import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static char[] A;
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        A = sc.next().toCharArray();
        n = A.length;


        int cnt = n * 20;
        for (int i = 0; i < n; i++) {

            // function call
            String result = runLengthEncoding();
            cnt = Math.min(cnt, result.length());
            shift();
        }

        // output
        System.out.println(cnt);

    }

    // shift
    private static void shift(){
        char temp = A[n - 1];

        for (int i = n-1; i > 0; i--) {
            A[i] = A[i - 1];
        }

        A[0] = temp;
    }

    // RunLengthEncoding
    private static String runLengthEncoding(){
        StringBuilder result = new StringBuilder();

        char currentChar = A[0];
        int cnt = 0;
        for (int i = 0; i < n+1; i++) {
            if (i == n){
                result.append(currentChar).append(cnt);
                break;
            }

            if (currentChar == A[i]) cnt++;
            else {
                result.append(currentChar).append(cnt);
                currentChar = A[i];
                cnt = 1;
            }
        }

        return result.toString();
    }
}