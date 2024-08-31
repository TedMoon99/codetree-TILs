import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String result = "";
        if(a == 5)
            result = "A";
        else if (a % 2 == 0)
            result = "B";
        else
            result = "";

        System.out.println(result);
    }
}