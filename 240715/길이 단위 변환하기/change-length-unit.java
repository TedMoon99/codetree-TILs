public class Main {
    public static void main(String[] args) {
        // 변수 선언
        double ft = 30.48;
        int mi = 160934;

        // 9.2ft, 1.3mi 계산
        double result1 = 9.2 * ft;
        double result2 = 1.3 * mi;

        // 출력
        System.out.printf("9.2ft = %.1fcm\n", result1);
        System.out.printf("1.3mi = %.1fcm", result2);
    }
}