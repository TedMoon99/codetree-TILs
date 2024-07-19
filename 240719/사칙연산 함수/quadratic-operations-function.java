import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // input
        int a = Integer.parseInt(st.nextToken());
        String op = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        // function call
        String result = operatorDivider(op, a, b);
        // output
        System.out.println(result);
    }
    // 어떤 연산자인지 구분
    private static String operatorDivider(String op, int a, int b){
        switch (op){
            case "+" : {
                return String.format("%d + %d = %d", a, b, plus(a, b));
            }
            case "-" : {
                return String.format("%d - %d = %d", a, b, minus(a, b));
            }
            case "*" : {
                return String.format("%d * %d = %d", a, b, multiple(a, b));
            }
            case "/" : {
                return String.format("%d / %d = %d", a, b, divider(a, b));
            }
        }
        return "False";
    }


    // 덧셈 함수
    private static int plus(int a, int b){
        return a + b;
    }

    // 뺄셈 함수
    private static int minus(int a, int b){
        return a - b;
    }

    // 곱셈 함수
    private static int multiple(int a, int b){
        return a * b;
    }

    // 나눗셈 함수
    private static int divider(int a, int b){
        return a / b;
    }
}