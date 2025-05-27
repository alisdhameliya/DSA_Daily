public class _q12_friendPairs {
    public static int totalPosiblePair(int n){
        if (n==1||n==2) {
            return 1;
        }

        return totalPosiblePair(n-1) + (n-2)*totalPosiblePair(n-2);
    }

    public static void main(String[] args) {
        System.out.println(totalPosiblePair(3));
    }
}
