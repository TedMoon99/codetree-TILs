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
                // 9 보다 큰 경우
                if( 4*i + j + 1 > 9){
                    System.out.print((4 * i + j + 1 - 9)+" ");
                } else {
                    System.out.print((4 * i + j+1)+" ");
                }
            }
            System.out.println();
        }
    }
}