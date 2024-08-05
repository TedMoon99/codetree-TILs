import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int[] Arrays = new int[input.length()];
        for (int i = 0; i < input.length(); i++){
            Arrays[i] = input.charAt(i) - '0';
        }
        // 2진수를 10진수로 변환한다
        int num = 0;
        for(int i = 0; i < Arrays.length; i++){
            num = 2 * num + Arrays[i];
        }
        // 출력한다
        System.out.println(num);
    }
}