import java.util.*;

public class Main {
    public static int[] locationList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Number[] numList = new Number[n];
        locationList = new int[n];
        // input
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            Number number = new Number(num, i + 1);
            numList[i] = number;
            locationList[i] = 1;
        }
        Number[] copyList = Arrays.copyOfRange(numList, 0, n);

        // Sorting
        Arrays.sort(numList, new Comparator<Number>() {
            @Override
            public int compare(Number o1, Number o2) {
                // 오름차순 정렬
                return o1.num - o2.num;
            }
        });

        // ouput
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                if (copyList[i].num == numList[j].num && copyList[i].index == numList[j].index) break;
                locationList[i]++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(locationList[i] + " ");
        }


    }


}

class Number {
    int num, index;

    Number(int num, int index) {
        this.num = num;
        this.index = index;
    }
}