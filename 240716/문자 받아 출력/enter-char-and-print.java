import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        // 문자열 입력받기
        String s = sc.next();
        // char 추출
        char c = s.charAt(0);
        // 출력
        System.out.println(c);
    }
}