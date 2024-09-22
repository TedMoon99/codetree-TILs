import java.util.Scanner;

public class Main {

    public static int lengthSum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            lengthSum += sc.next().length();
        }

        System.out.println(lengthSum);
    
    }
}