import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        String s = sc.next();
        char[] A = new char[s.length()];
        for (int i = 0; i < s.length(); i++){
            A[i] = s.charAt(i);
        }
        // DP
        int count = 0;
        for (int i = 0; i < A.length; i++){
            // 닫힌 괄호가 먼저 나온 경우 넘긴다
            if (A[i] == ')') continue;
            int j = i+1;
            // 끝에 도달할 때까지 반복한다
            while (j < A.length){
                // 닫힌 괄호가 나온다면 count+1
                if (A[j] == ')') count++;
                j++;
            }
        }
        // output
        System.out.println(count);
    }
}