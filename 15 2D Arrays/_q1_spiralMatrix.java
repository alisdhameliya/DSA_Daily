public class _q1_spiralMatrix {
    public static void printSpiralMatrix(int matrix[][]) {

        int sr = 0;
        int sc = 0;
        int er = matrix.length - 1;
        int ec = matrix[0].length - 1;

        while (sr <= er && sc <= ec) {
            // left to right
            for (int i = sc; i <= ec; i++) {
                System.out.print(matrix[sr][i] + " ");
            }
            // top to bottom
            for (int i = sr + 1; i <= er; i++) {
                System.out.print(matrix[i][ec] + " ");
            }
            // right to left
            for (int i = ec - 1; i >= sc; i--) {
                if (sr==er) {
                    break;
                }
                System.out.print(matrix[er][i] + " ");
            }
            // bottom to top
            for (int i = er - 1; i >= sr + 1; i--) {
                if (sc==ec) {
                    break;
                }
                System.out.print(matrix[i][sc] + " ");
            }

            System.out.println();
            sc++;
            sr++;
            er--;
            ec--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { 
            { 1,  2,  3,  4,  17},
            { 5,  6,  7,  8 , 18}, 
            { 9,  10, 11, 12, 19}, 
            { 13, 14, 15, 16 ,20},
            { 21, 22, 23, 24, 25} };
        printSpiralMatrix(matrix);
    }
}
