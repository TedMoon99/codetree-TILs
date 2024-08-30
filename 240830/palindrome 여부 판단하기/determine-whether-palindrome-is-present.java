import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(), result = "";
        // function call
        result = printResult(input);
        // output
        System.out.print(result);
    }

    public static String printResult(String s){
        return (isPalindrome(s)) ? "Yes": "No";
    }

    public static boolean isPalindrome(String s){
        for (int i = 0; i < s.length() / 2; i++){
            if (s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
}