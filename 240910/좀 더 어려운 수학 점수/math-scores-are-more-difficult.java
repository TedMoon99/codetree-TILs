import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mathA = sc.nextInt(), engA = sc.nextInt(), mathB = sc.nextInt(), engB = sc.nextInt();

        if(mathA > mathB){
            System.out.println("A");
        } else if (mathB > mathA){
            System.out.println("B");
        } else{
            if(engA > engB){
                System.out.println("A");
            } else{
                System.out.println("B");
            }
        }
    }
}