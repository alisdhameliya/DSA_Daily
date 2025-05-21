import java.util.Scanner;

public class _q1_binomialCoffient {

    public static int factorial(int n) {
        int j = 1;
        for (int i = 1; i <= n; i++) {
            j = i * j;
        }
        return j;
    }

    public static int binomialCofficient(int n, int r) {
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nmrfact = factorial(n - r);
        int binCoff = nfact / (rfact * nmrfact);
        return binCoff;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n:");
        int n = sc.nextInt();

        System.out.println("enter value of r:");
        int r = sc.nextInt();
        System.out.println(binomialCofficient(n, r));
    }
}