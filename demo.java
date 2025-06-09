import java.util.Arrays;
import java.util.Scanner;

public class demo {
    static int revese(int n,int ans){
        if (n == 0) {
            return ans/10;
        }
        int ld = n%10;
        return revese(n/10, ans=(ans+ld)*10);
    }
    public static void main(String[] args) {
        char[][] board = new char[4][4];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

        System.out.println(revese(214,0));
    }
}
