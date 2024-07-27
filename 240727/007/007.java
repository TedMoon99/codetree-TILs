import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input 
        String code = sc.next();
        char[] temp = sc.next().toCharArray();
        char place = temp[0];
        int time = sc.nextInt();
        // Instance call
        Secret secret = new Secret(code, place, time);
        // output
        System.out.printf("secret code : %s\n", secret.code);
        System.out.printf("meeting point : %c\n", secret.place);
        System.out.printf("time : %d", secret.time);


    }
}

class Secret{
    // 멤버 변수
    String code;
    char place;
    int time;
    // 생성자(constructor)
    public Secret(String code, char place, int time){
        this.code = code;
        this.place = place;
        this.time = time;
    }
}