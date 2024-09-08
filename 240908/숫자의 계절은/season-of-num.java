import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        String result = "";
        if (m >=3 && m <= 5) result = "Spring";
        else if (m >= 6 && m <= 8) result = "Summer";
        else if (m >= 9 && m <= 11) result = "Fall";
        else  result = "Winter";

        System.out.println(result);
    }
}