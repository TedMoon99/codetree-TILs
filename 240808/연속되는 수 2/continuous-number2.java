import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0;
        int[] numList = new int[n];
        ArrayList<Integer> cntList = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++){
            numList[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            if (i == 0 || numList[i] == numList[i-1]) cnt++;
            else {
                cntList.add(cnt);
                cnt = 1;
            }
        }
        int max = 0;
        for (int i = 0; i < cntList.size(); i++){
            if (cntList.get(i) > max) max = cntList.get(i);
        }

        // output
        System.out.print(max);
    }
}