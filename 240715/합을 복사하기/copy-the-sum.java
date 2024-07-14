public class Main {
    public static void main(String[] args) {
        // 변수 선언
        int a = 1, b = 2, c = 3;
        int sum = a + b + c;

        // 값 복사
        a = b = c = sum;

        // 출력
        System.out.printf("%d %d %d", a, b, c);
    }
}