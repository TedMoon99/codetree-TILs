import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        int n = sc.nextInt(), k = sc.nextInt();
        String t = sc.next();
        String[] A = new String[n];
        for (int i = 0; i < n; i++){
            A[i] = sc.next();
        }
        // function call
        String result = fun(A, n, k, t);
        // output
        System.out.println(result);
    }

    private static String fun(String[] A, int n, int k, String t){
        String[] temp = new String[n];
        int index = 0;
        for(String element: A){
            if (element.contains(t)) addArray(temp, element, index++);
        }

        // temp에서 null 제외
        List<String> tempList = new ArrayList<>(Arrays.asList(temp)); // Array
        tempList.removeAll(Collections.singleton(null));
        String[] resultArray = tempList.toArray(new String[0]);
        Arrays.sort(resultArray);

        return resultArray[k-1];
    }

    private static void addArray(String[] A, String element, int index){
        A[index] = element;
    }
}