public class _q2_digonalSum {
    public static int digonalSum(int matrix[][]){
        int sum=0;
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if (i==j) {
        //             sum+=matrix[i][j];
        //         }
        //         if (i+j == matrix.length-1) {
        //             sum+= matrix[i][j];
        //         }
        //     }
        // }

        // time coplexity = O(n^2)

        //linear time coplexity

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length-1-i) {
                sum += matrix[i][matrix.length-1-i];
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = { 
            { 1,  2,  3,  4,  17},
            { 5,  6,  7,  8 , 18}, 
            { 9,  10, 11, 12, 19}, 
            { 13, 14, 15, 16 ,20},
            { 21, 22, 23, 24, 25} };
        System.out.println(digonalSum(matrix));
    }
}
