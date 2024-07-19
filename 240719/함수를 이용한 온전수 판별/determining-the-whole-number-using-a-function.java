import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // input
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        // function call
        int count = countFun(a, b);
        // output\
        System.out.println(count);
    }

    // 온전수 갯수 세는 함수
    private static int countFun(int a, int b){
        int i, count = 0;
        // a ~ b
        for (i = a; i <= b; i++){
            // 온전수인가? 
            if (isNot2(i) && lastIsNot5(i) && (isNot3(i) || is9(i))){
                count += 1;
            }
        }
        return count;
    }
    // 일의 자리가 5가 아닌가
    private static boolean lastIsNot5(int x ){
        if (x % 10 != 5){ return true;}
        return false;
    }
    // 2로 나누어 떨어지지 않는가
    private static boolean isNot2(int x){
        if (x % 2 == 0){ return false; }
        return true;
    }

    // 3의 배수가 아닌가
    private static boolean isNot3(int x){
        if (x % 3 == 0){ return false; }
        return true;
    }
    // 9의 배수인가
    private static boolean is9(int x){
        if(x % 9 == 0){ return true; }
        return false;
    }
    // 
}