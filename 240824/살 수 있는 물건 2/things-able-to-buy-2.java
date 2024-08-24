import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String result = "no";
        int n = sc.nextInt();
        if (n >= 3000)
            result = "book";
        else if (n >= 1000)
            result = "mask";
        else if (n >= 500)
            result = "pen";
        else 
            result = "no";
        

        System.out.println(result);


    }
}