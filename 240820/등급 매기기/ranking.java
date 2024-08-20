import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String result;
        if  (n >= 90){
            result = "A";
        } else if (n >= 80)
        result = "B";
        else if( n >= 70)
        result = "C";
        else if (n >= 60)
        result = "D";
        else
        result = "F";

        System.out.println(result);
    }
}