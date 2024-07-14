public class Main {
    public static void main(String[] args) {
        // 변수 선언
        int a = 2, b = 5;
        int temp;

        // 값 임시 저장
        temp = a;

        // 값 교환
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}