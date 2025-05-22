public class _q4_sumOf2ndRow {
    public static int sumOf2ndRow(int matrix[][]) {
        int sum = 0;

        for (int j = 0; j < matrix[1].length; j++) {
            sum+=matrix[1][j];
        }

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4, 1 },
                { 5, 6, 7, 8, 1 },
                { 9, 10, 7, 12, 1 },
                { 13, 7, 15, 16, 2 },
                { 21, 7, 23, 24, 25 } };
        System.out.println("sumOf2ndRow = " + sumOf2ndRow(matrix));
    }
}
