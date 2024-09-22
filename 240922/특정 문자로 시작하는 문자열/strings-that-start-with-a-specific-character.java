import java.util.Scanner;

public class Main {

    public static String[] arr;
    public static char target;
    public static int cnt = 0, averageLength = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new String[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.next();
        }

        target = sc.next().charAt(0);
    
        for (int i = 0; i < n; i++){
            if (arr[i].charAt(0) == target){
                cnt++;
                averageLength += arr[i].length();
            }
        }

        System.out.printf("%d %.2f", cnt, (double)(averageLength / cnt));
    }
}