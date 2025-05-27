public class _q4_sumOfNnaturalNo {
    public static int sumOfNnaturalNo(int n){
        if (n<0) {
            return 0;
        }
        if (n==1) {
            return 1;
        }
        return n + sumOfNnaturalNo(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sumOfNnaturalNo(5));
    }
}
