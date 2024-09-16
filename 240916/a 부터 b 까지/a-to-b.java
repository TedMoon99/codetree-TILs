import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();

        int num = a;
        while(num <= b){
            System.out.print(num + " ");
            if (num % 2 == 1) num *= 2;
            else num += 3;
        }

        
    }
}