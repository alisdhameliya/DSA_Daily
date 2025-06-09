import java.util.Arrays;

public class _q3_nQueen {
    public static int count =0;

    public static void nQueens(char board[][], int row){
        //base 
        if (row == board.length) {
            count++;
            System.out.println(count+". "+"----------- chess board --------------");
            printArr(board);
            return;
        }
        // column loop
        // for (int j = 0; j < board.length; j++) {  // -----for all posible position of Q in board. -----
        //     board[row][j] = 'Q';
        //     nQueens(board, row+1); 
        //     board[row][j] = '.';
        // }

        //column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board,row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row+1); 
                board[row][j] = 'x';
            }
        }
    }

    public static boolean isSafe(char[][] board,int row, int col){
        // vertical check 
        for (int i = row-1; i >=0; i--) {
            if (board[i][col]=='Q') {
                return false;
            }
        }

        // left-up diagonal check 
        for (int i = row-1, j = col-1; i >=0 && j>=0; i--,j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // right- up diagonal check 
        for (int i = row-1,j=col+1; i>=0 && j < board.length ;i--,j++ ) {
             if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void printArr(char board[][]){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n; j++) {
                board[i][j] = 'x';
            }
        }
        printArr(board);
        nQueens(board, 0);
    }
}
