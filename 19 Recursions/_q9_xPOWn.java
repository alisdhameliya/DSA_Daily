public class _q9_xPOWn {
    public static int POW(int x,int n){
        if (n==0) {
            return 1;
        }
        return x* POW(x,n-1); // O(n) time complexity
    }

    public static int pow(int x,int n){
        if (n == 0) {
            return 1;
        }

        int halfPower = pow(x, n/2) ;
        int halfPowerSq = halfPower * halfPower ;
        if (n%2!=0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq; // O(log n) time complexity is less than POW function. 
    }

    public static void main(String[] args) {
        System.out.println(POW(2, 10));
        System.out.println(pow(2, 10));
    }
}
