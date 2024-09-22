import java.util.Scanner;

public class Main {

    public static String[] arr = new String[]{"apple", "banana","grape", "blueberry", "orange"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char target = sc.next().charAt(0);
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(2) == target || arr[i].charAt(3) == target){
                System.out.println(arr[i]);
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}