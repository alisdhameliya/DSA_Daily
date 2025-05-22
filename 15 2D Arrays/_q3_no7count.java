public class _q3_no7count {
    public static int count(int matrix[][]){
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int matrix[][] = { 
            { 1,  2,  3,  4,  1},
            { 5,  6,  7,  8 , 1}, 
            { 9,  10, 7, 12, 1}, 
            { 13, 7, 15, 16 ,2},
            { 21, 7, 23, 24, 25} };
        System.out.println("count of 7 = "+count(matrix));
    }
}
