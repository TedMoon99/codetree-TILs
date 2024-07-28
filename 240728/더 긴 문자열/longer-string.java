import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next(), str2 = sc.next();
        int l1 = str1.length(), l2 = str2.length();
        if(l1 == l2) System.out.println("same");
        else if (l1 > l2) System.out.printf("%s %d", str1, l1);
        else System.out.printf("%s %d", str2, l2);
    
    }
}