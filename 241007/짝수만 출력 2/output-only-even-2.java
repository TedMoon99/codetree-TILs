import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int a, b;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        b = Integer.parseInt(st.nextToken());
        a = Integer.parseInt(st.nextToken());

        while(b >= a){
            if (b % 2 == 0) System.out.print(b + " ");
            b--;
        }
    }
}