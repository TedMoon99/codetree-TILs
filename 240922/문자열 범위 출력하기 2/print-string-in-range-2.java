import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = sc.nextInt();

        if (s.length() < n){
            for (int i = s.length()-1; i >= 0; i--){
                System.out.print(s.charAt(i));
            }
        } else {
            for(int i = s.length()-1; i >= s.length()-n; i--){
                System.out.print(s.charAt(i));
            }
        }
    }
}