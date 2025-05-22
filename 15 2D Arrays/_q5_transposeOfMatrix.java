public class _q5_transposeOfMatrix {
    public static void transpose(int matrix[][]){
        int transpose[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int matrix[][] = { 
            { 1,  2,  3,  4,  1},
            { 5,  6,  7,  8 , 1}, 
            { 9,  10, 7, 12, 1}, 
            { 13, 7, 15, 16 ,2},
            { 21, 7, 23, 24, 25} };
        transpose(matrix);
    }
}
