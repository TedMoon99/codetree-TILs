import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age1, age2;
        String sex1, sex2;
        age1 = sc.nextInt();
        sex1 = sc.next();
        age2 = sc.nextInt();
        sex2 = sc.next();

        if((sex1.equals("M") && age1 >= 19)||(sex2.equals("M") && age2 >= 19)) System.out.println(1);
        else System.out.println(0);
    }
}