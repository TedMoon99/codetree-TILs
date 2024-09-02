import java.util.Scanner;

public class Main {

    public static int n, count = 0;
    public static int[] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        A = new int[n];
        // input
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int maxSum = 0;
        // function call
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if (!carryWatcher(A[i], A[j], A[k])){
                        count++;
                        continue;
                    }
                    // 최대합 계산
                    maxSum = Math.max(maxSum, A[i]+A[j]+A[k]);
                }
            }
        }

        // output
        System.out.println((count != (n-2) * (n-3) * (n-4))? maxSum: -1);
    }

    // 3개의 숫자를 골랐을 때 carry가 존재하는지 확인(true: carry 비존재, false: carry 존재)
    static boolean carryWatcher(int num1, int num2, int num3){
        String s1 = Integer.toString(num1);
        String s2 = Integer.toString(num2);
        String s3 = Integer.toString(num3);
        return isCarry(s1, s2) && isCarry(s2, s3) && isCarry(s3, s1);
    }

    // carry 인지 확인
    static boolean isCarry(String num1, String num2){
        int size1 = num1.length(), size2 = num2.length(), diff = Math.abs(size1 - size2);
        if (size1 >= size2){
            for (int i = size2-1; i >= 0; i--) {
                int n1 = num1.charAt(i+diff) -'0', n2 = num2.charAt(i)-'0';
                if (n1 + n2 >= 10) return false;
            }
        } else {
            for (int j = size1-1; j >= 0; j--) {
                int n1 = num1.charAt(j) -'0', n2 = num2.charAt(j+diff)-'0';
                if (n1 + n2 >= 10) return false;
            }
        }
        return true;
    }
}