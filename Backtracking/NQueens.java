import java.util.Scanner;

public class NQueens {
    static Scanner scan = new Scanner(System.in);
    static int N;

    public static void main(String[] args) {
        System.out.println("--------- N-Queen Problem ---------");
        NQueens nQueens = new NQueens();

        System.out.print("How many Queen(s) you want: ");
        N = scan.nextInt();

        nQueens.createBoard(N);
    }

    void createBoard(int N) {

        int[][] board = new int[N][N];

        if (!nQueenSolve(board, 0)) {
            System.out.println("Solution Doesn't Exist");
//            return;
        }

        printNQ(board);
    }

    boolean isSafe(int[][] board, int row, int col) {
        int i, j;
        for (i = 0; i < row; i++)
            if (board[i][col] == 1)
                return false;

        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;
        return true;
    }

    boolean nQueenSolve(int[][] board, int row) {
        if (row >= N) {
            return true;
        }

        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;

                if (nQueenSolve(board, row + 1)) {
                    return true;
                }

                board[row][col] = 0;
            }
        }
        return false;
    }

    void printNQ(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
