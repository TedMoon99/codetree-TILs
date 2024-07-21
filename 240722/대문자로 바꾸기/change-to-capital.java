import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        // 배열 선언
        int[][] A = new int[5][3];
        // input
        for (int i =0; i <5; i++){
            for (int j = 0; j<3; j++){
                String str = sc.next();
                System.out.print(str.toUpperCase() + " ");
            }
            System.out.println();
        }
    }
}