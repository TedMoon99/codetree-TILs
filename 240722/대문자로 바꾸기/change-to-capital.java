import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        // 배열 선언
        String[][] A = new String[5][3];
        // input
        for (int i =0; i <5; i++){
            for (int j = 0; j<3; j++){
                A[i][j] = sc.next();
            }
        }
        // ouput
        for (int i =0; i <5; i++){
            for (int j = 0; j<3; j++){
                System.out.print(A[i][j].toUpperCase() + " ");
            }
            System.out.println();
        }
    }
}