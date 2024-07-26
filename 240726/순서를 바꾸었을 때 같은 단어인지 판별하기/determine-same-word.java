import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        String word1 = sc.next();
        String word2 = sc.next();
        // function call
        String result = fun(word1, word2);
        // output
        System.out.println(result);
    }

    // 두 단어에 속하는 문자들의 순서를 바꾸어 동일한 단어로 만들 수 있는지 여부를 출력
    private static String fun(String A, String B){
        // char Array로 변환
        char[] charA = A.toCharArray();
        char[] charB = B.toCharArray();
        // 오름차순 정렬
        Arrays.sort(charA);
        Arrays.sort(charB);
        // check
        for (int i = 0; i < charA.length; i++){
            if(charA[i] != charB[i]) return "No";
        }
        return "Yes";
    }
}