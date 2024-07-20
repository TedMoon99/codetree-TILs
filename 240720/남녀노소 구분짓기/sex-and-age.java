import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        int sex = sc.nextInt(), age = sc.nextInt();
        // function call
        printHuman(sex, age);
    }

    private static void printHuman(int sex, int age){
        // 남자
        if (sex == 0){
            // 성인
            if (age >= 19){
                System.out.println("MAN");
            } else {
                System.out.println("BOY");
            }
        }
        // 여자 
        else if (sex == 1){
            // 성인
            if (age >= 19){
                System.out.println("WOMAN");
            } else {
                System.out.println("GIRL");
            }
        }
    
    }
}