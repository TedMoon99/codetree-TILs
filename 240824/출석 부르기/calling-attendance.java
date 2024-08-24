import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch(n){
            case 1:
                System.out.println("John");
                break;
            case 2:
                System.out.println("Tom");
                break;
            case 3:
                System.out.println("Paul");
                break;
            default:
                System.out.println("Vacancy");
                break;
        }
    }
}