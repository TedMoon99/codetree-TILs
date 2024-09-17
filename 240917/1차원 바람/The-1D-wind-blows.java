import java.util.Scanner;

public class Main {

    // 방향( 0: 아래쪽, 1: 위쪽 )
    public static int[][] A;
    public static int N, M, Q, r;
    public static String DIR; // DIR : Left || Right
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        Q = sc.nextInt();
        A = new int[N][M];
        // input
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < Q; i++) {
            // input
            r = sc.nextInt() - 1;
            DIR = sc.next();
            // function call
            int rowDir = makeDir(DIR);
            implement(r, rowDir, 1); // 위쪽
            shift(A[r], (rowDir+1)%2);
            implement(r, rowDir, 0); // 아래쪽
        }

        // output
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) System.out.print(A[i][j] + " ");
            System.out.println();
        }
    }

    // 전파가 일어날 수 없는 조건 || 끝에 도달할 때까지 반복한다
    private static void implement(int currentRow, int dirRow, int dirCol){
        int currentDirRow = dirRow;
        int implementedRow = currentRow;

        shift(A[implementedRow], currentDirRow);
        while(isSpread(implementedRow, dirCol)){
            currentDirRow = (currentDirRow + 1) % 2;
            implementedRow = (dirCol == 1) ? implementedRow - 1 : implementedRow + 1;
            shift(A[implementedRow], currentDirRow);
        }
    }


    // 한 행과 방향이 주어졌을 때, 한 칸씩 Shift 한다
    private static void shift(int[] row, int dir){
        int temp;
        if (dir == 0){
            // 왼쪽으로 이동
            temp = row[0]; // 가장 왼쪽 값 저장
            for (int i = 0; i < M-1; i++) {
                row[i] = row[i + 1];
            }
            row[M - 1] = temp;
        } else {
            // 오른쪽으로 이동
            temp = row[M - 1]; // 가장 오른쪽 값 저장
            // move
            for (int i = M-1; i > 0; i--) {
                row[i] = row[i - 1];
            }
            row[0] = temp;
        }
    }

    // 한 행과 방향이 주어졌을 때, 전파가 일어날 수 있는지 또는 끝인지 확인한다
    // false : 불가능
    // true : 가능
    private static boolean isSpread(int row, int dir){
        if (dir == 1){
            // 위쪽 방향
            if (row - 1 < 0) return false;
            for (int i = 0; i < M; i++) {
                if (A[row][i] == A[row-1][i]) return true;
            }
            return false;
        } else {
            // 아래쪽 방향
            if (row + 1 > N-1) return false;
            for (int i = 0; i < M; i++) {
                if (A[row][i] == A[row+1][i]) return true;
            }
            return false;
        }
    }

    // 입력된 방향에 따라 적절한 숫자를 반환한다
    private static int makeDir(String dir){
        return (dir.equals("L"))? 1 :  0; // Left : 1, Right : 0
    }
}