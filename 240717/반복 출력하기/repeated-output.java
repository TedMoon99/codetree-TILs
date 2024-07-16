import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        // 함수 호출
        printNLines(rowNum);
    }

    public static void printNLines(int n){
        // n 번 반복
        for(int i = 0; i < n; i++){
            System.out.println("12345^&*()_");
        }
    }
}