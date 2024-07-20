import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // input
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
        // function call
        int result = findMaximum(a, b, c);
        // output
        System.out.println(result);

    }

    // 최댓값을 출력한다
    private static int findMaximum(int x, int y, int z){
        // x > y
        if ( x >= y ){
            // x > y > z
            if (x >= z){
                return x;
                // y > x > z
            } else { return z;}
            // y > x
        } else {
            //y > x > z
            if ( y > z){
                return y;
                // y > x 
            } else { return z; }
        }
    }
}