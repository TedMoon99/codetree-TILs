public class Main {
    public static void main(String[] args) {
        // 변수 선언
        int a = 5, b = 6, c = 7;

        // 값 동시에 복사
        a = b = c;

        // 출력
        System.out.printf("%d %d %d", a, b, c);

    }
}