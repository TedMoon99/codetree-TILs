import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static char[] A;
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        A = sc.next().toCharArray();
        n = A.length;

        Arrays.sort(A);

        // function call
        String result = runLengthEncoding();

        // output
        System.out.println(result.length());
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