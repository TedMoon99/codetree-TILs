public class Main {
    public static void main(String[] args) {
        // 변수 선언
        int a = 5, b = 6, c =7;
        int temp;

        // 값 임시 저장
        temp = b;
        
        // 값 교환
        b = a;
        a = c;
        c = temp;

        // 출력 
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}