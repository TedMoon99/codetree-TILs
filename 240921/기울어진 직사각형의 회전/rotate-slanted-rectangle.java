import java.util.Scanner;

public class Main {
    public static int N;
    public static int startRow, startCol, m1, m2, m3, m4, dir;
    public static int[] rectangle, traceRow, traceCol;
    public static int[][] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        A = new int[N + 1][N + 1];

        // input
        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < N + 1; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        startRow = sc.nextInt();
        startCol = sc.nextInt();
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        dir = sc.nextInt();

        rectangle = new int[m1 + m2 + m3 + m4];
        traceRow = new int[m1 + m2 + m3 + m4];
        traceCol = new int[m1 + m2 + m3 + m4];

        // function call
        makeRectangle();
        rotateRectangle();
        fixRectangle();

        // output
        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < N+1; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 1. 기울어진 직사각형 만들기
    private static void makeRectangle(){
        int row = startRow, col = startCol;
        // 1번 방향(우상)
        for (int i = 0; i < m1; i++) {
            rectangle[i] = A[--row][++col];
            traceRow[i] = row;
            traceCol[i] = col;
        }
        // 2번 방향(좌상)
        for (int i = m1; i < m1+m2; i++) {
            rectangle[i] = A[--row][--col];
            traceRow[i] = row;
            traceCol[i] = col;
        }
        // 3번 방향(좌하)
        for (int i = m1+m2; i < m1+m2+m3; i++) {
            rectangle[i] = A[++row][--col];
            traceRow[i] = row;
            traceCol[i] = col;
        }
        // 4번 방향(우하)
        for (int i = m1+m2+m3; i < m1+m2+m3+m4; i++) {
            rectangle[i] = A[++row][++col];
            traceRow[i] = row;
            traceCol[i] = col;
        }
    }

    // 2. 기울어진 직사각형 테이블 회전시키기
    private static void rotateRectangle() {
        int temp;
        if (dir == 1){
            temp = rectangle[0];
            for (int i = 0; i < rectangle.length-1; i++) {
                rectangle[i] = rectangle[i+1];
            }
            rectangle[rectangle.length-1] = temp;
        } else {
            temp = rectangle[rectangle.length-1];
            for (int i = rectangle.length-1; i > 0; i--) {
                rectangle[i] = rectangle[i-1];
            }
            rectangle[0] = temp;
        }
    }

    // 3. 남겨진 기록을 따라 돌면서 A에 값을 넣는다
    private static void fixRectangle() {
        int row, col;
        for (int i = 0; i < rectangle.length; i++) {
            row = traceRow[i];
            col = traceCol[i];

            A[row][col] = rectangle[i];
        }
    }
}