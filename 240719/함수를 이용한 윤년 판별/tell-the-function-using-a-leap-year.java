import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // input
        int a = Integer.parseInt(st.nextToken());
        // function call
        boolean result = isYoonYear(a);
        // output
        System.out.println(result);
    }
    // 윤년인지 아닌지 알려준다
    private static boolean isYoonYear(int x){
        if (x % 4 == 0){ return true; }
        return false;
    }
}