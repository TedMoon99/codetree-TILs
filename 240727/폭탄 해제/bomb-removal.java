import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        char color = sc.next().toCharArray()[0];
        int second = sc.nextInt();
        // Instance call
        Code cd = new Code(code, color, second);
        System.out.printf("code : %s\n", code);
        System.out.printf("color : %c\n", color);
        System.out.printf("second : %d\n", second);
        

    }
}

class Code{
    String code;
    char color;
    int second;

    Code(){
        code = "";
        color = '0';
        second = 0;
    }

    Code(String code, char color, int second){
        this.code = code;
        this.color = color;
        this.second = second;
    }
}