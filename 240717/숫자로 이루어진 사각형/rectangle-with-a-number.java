import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 함수 호출
        printNumber(n);
    }

    public static void printNumber(int n){
        // n 번 반복
        for(int i=0; i< n; i++){
            // n번 반복
            for(int j =0; j<n; j++){
                // 해당 숫자가 10이상인 경우 
                int count = (n * i + j) / 9;
                // 출력
                System.out.print((n * i + j + 1 - 9 * count)+" ");
            }
            System.out.println();
        }
    }
}