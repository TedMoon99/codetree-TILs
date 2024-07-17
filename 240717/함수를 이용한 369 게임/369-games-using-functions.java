import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Main {
    // 3, 6, 9 중에 하나를 포함하는 숫자인가요?
    private static boolean is369(int num){
        // int 값을 String으로 변환
        String stringValue = String.valueOf(num);

        // 결과를 저장할 List 생성
        List<Integer> intList = new ArrayList<>();

        // 문자열의 각 문자를 순회하면서 리스트에 추가
        for (char c : stringValue.toCharArray()){
            intList.add(Character.getNumericValue(c));
        }
        
        return intList.contains(3) || intList.contains(6) || intList.contains(9);

    }

    // a ~ b 수 중 3, 6, 9 중에 하나가 들어가 있거나 그 숫자 자체가 3의 배수인 숫자의 개수
    private static int count(int a, int b){
        int count = 0;
        for(int i = a; i <= b; i++){
            if (i % 3 == 0 || is369(i)){
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // input
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        // function call
        int cnt = count(a, b);
        // output
        System.out.println(cnt);
    }
}