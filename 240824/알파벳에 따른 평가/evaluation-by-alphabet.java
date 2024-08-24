import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String result = "";
        String input = sc.next();

        switch(input){
            case "S":
                result = "Superior";
                break;
            case "A":
                result = "Excellent";
                break;
            case "B":
                result = "Good";
                break;
            case "C":
                result = "Usually";
                break;
            case "D":
                result = "Effort";
                break;
            default:
                result = "Failure";
                break;
        }
        System.out.println(result);
    }
}