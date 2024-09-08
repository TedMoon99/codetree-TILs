import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int middle = sc.nextInt(), finish = sc.nextInt();
        int pay = 0;
        if (middle >= 90){
            if (finish >= 95) pay = 100000;
            else if (finish >= 90) pay = 50000;
            else pay = 0;
        }

        System.out.println(pay);
    }
}