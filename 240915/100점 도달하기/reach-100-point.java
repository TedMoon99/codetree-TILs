import java.util.Scanner;

public class Main {

    public static int score;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        score = sc.nextInt();

        for (int i = score; i < 100; i++){
            fun(i);
        }
    }

    private static void fun(int score){
        String result = "";
        if (score >= 90) result = "A";
        else if (score >= 80) result = "B";
        else if (score >= 70) result = "C";
        else if (score >= 60) result = "D";
        else result = "F";

        System.out.print(result + " ");
    }
}