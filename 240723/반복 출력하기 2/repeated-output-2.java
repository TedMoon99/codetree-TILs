import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStar(n);
    }

    public static void printStar(int n){
        if(n < 1) return;
        printStar(n-1);
        System.out.println("HelloWorld");
    }
}