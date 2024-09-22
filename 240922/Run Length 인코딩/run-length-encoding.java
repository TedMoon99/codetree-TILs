import java.util.*;

public class Main {

    public static char[] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A = sc.next().toCharArray();


//        Arrays.sort(A);

        char currnetChar = A[0];
        int cnt = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < A.length+1; i++){
            if (i == A.length){
                result.append(currnetChar).append(cnt);
                break;
            }
            if (currnetChar == A[i]) cnt++;
            else {
                result.append(currnetChar).append(cnt);
                currnetChar = A[i];
                cnt = 1;
            }
        }

        System.out.println(result.length());
        System.out.println(result);

    }
}