import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++){
            result.append(sc.next());
        }

        System.out.println(result);
    }
}