import java.util.Scanner;

public class Main {
    public static int N, M, Q;
    public static int[][] A, B;
    public static int rowStart, rowEnd, colStart, colEnd;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        Q = sc.nextInt();
        A = new int[N+1][M+1];
        B = new int[N+1][M+1];

        // ----- input -----

        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < M+1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // ------------------

        // function call
        for (int i = 0; i < Q; i++) {
            rowStart = sc.nextInt();
            colStart = sc.nextInt();
            rowEnd = sc.nextInt();
            colEnd = sc.nextInt();

            shift();
            B = deepCopy(A);
            traversal();
        }




        // output
        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < M+1; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
    // 0. 배열 복사 코드
    private static int[][] deepCopy(int[][] arr){
        int[][] result = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i].clone();
        }
        return result;
    }

    // 1. 시계방향으로 한칸씩 shift
    private static void shift(){
        int tempFinal = A[rowStart][colEnd];
        int temp = A[rowStart+1][colStart];

        // 오른쪽으로 이동
        for (int i = colEnd; i >= colStart; i--) {
            A[rowStart][i] = A[rowStart][i - 1];
        }
        A[rowStart][colStart] = temp;

        // 위로 이동
        temp = A[rowEnd][colStart + 1];
        for (int i = rowStart+1; i < rowEnd; i++) {
            A[i][colStart] = A[i + 1][colStart];
        }
        A[rowEnd][colStart] = temp;

        // 왼쪽으로 이동
        temp = A[rowEnd - 1][colEnd];
        for (int i = colStart+1; i < colEnd; i++) {
            A[rowEnd][i] = A[rowEnd][i + 1];
        }
        A[rowEnd][colEnd] = temp;

        // 아래로 이동
        temp = tempFinal;
        for (int i = rowEnd; i > rowStart+1; i--) {
            A[i][colEnd] = A[i - 1][colEnd];
        }
        A[rowStart + 1][colEnd] = temp;
    }

    // 2. 사각형 내부영역으로 순회한다
    private static void traversal(){
        for (int i = rowStart; i <= rowEnd; i++) {
            for (int j = colStart; j <= colEnd; j++) {
                A[i][j] = calculateAverage(i, j);
            }
        }
    }

    // 3. 자신과 인접한 값의 평균을 계산한다
    private static int calculateAverage(int row, int col){
        int total = 0, num = 5;
        int up = row - 1, down = row + 1, left = col - 1, right = col + 1;
        // 상의 값이 범위 안에 있는가
        if (up > 0) total += B[up][col];
        else num--;
        // 하의 값이 범위 안에 ®있는가
        if (down < N+1) total += B[down][col];
        else num--;
        // 좌의 값이 범위 안에 있는가
        if (left > 0) total += B[row][left];
        else num--;
        // 우의 값이 범위 안에 있는가
        if (right < M+1) total += B[row][right];
        else num--;

        // 자신 본인 추가
        total += B[row][col];

        // 평균 계산
        return (int) total / num;
    }

}