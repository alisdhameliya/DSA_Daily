public class _q2_PrimeOrNot {
    public static void main(String[] args) {
        int n=4;
        boolean b = true;
        for (int i = 2; i < n-1; i++) {
            if (n%i==0) {
                b = false;
            }
        }
        if (b) {
            System.out.println("Prime Number.");
        }else{
            System.out.println("Not Prime.");
        }
    }
}
