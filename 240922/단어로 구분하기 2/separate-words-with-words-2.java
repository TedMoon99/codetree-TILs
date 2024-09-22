import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            if(i % 2 == 0) System.out.println(sc.next());
            else sc.next();
        }
    }
}