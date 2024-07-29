import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        String input = sc.nextLine(), target = sc.next();

        // 앞서 주어준 문자열에 target이 몇 개 있는지
        int length = input.length();
        int length2 = input.replace(target, "").length();
        System.out.println(length-length2);
    }
}