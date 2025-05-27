public class _q10_tillingProblem {
    public static int calculteCombination(int n){
        if (n==0) {
            return 1;
        }
        if (n==1) return 1;

        return calculteCombination(n-1) + calculteCombination(n-2);
    }

    public static void main(String[] args) {
        System.out.println(calculteCombination(4));
    }
}
