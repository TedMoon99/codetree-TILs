import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        // input
        int n = sc.nextInt();
        // function call
        int result = countDate(n);
        // output
        System.out.println(result);

    }
    // 몇 일이 있는지를 반환
    private static int countDate(int x){
        if (x == 2){ return 28; }
        int[] arr31 = new int[]{1, 3, 5, 7, 8, 10, 12};
        int[] arr30 = new int[]{4, 6, 9, 11};
        
        // 확인 
        for(int i = 0; i < arr31.length; i++){
            if (arr31[i] == x){ return 31; }
        }

        for(int i = 0; i < arr30.length; i++){
            if (arr30[i] == x){ return 30; }
        }
        return -1;
    }
}