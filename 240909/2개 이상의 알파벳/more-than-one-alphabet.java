import java.util.Scanner;


public class Main {

    // 서로 다른 알파벳의 수가 2개 이상이면 true, 아니면 false
    private static boolean judge(String A){
        int cnt = 0;
        for (int i = 0; i < A.length(); i++) {
            for (int j = 1; j < A.length(); j++) {
                if (A.charAt(i) != A.charAt(j)) cnt++;
            }
            if (cnt >= 1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println((judge(A))? "Yes": "No");
    }
}