public class _q13_removeConsicutiveOne {
    public static void removeConsicutiveOne(int n,int lastPlace, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }

        // Include 1
        removeConsicutiveOne(n - 1, 0, ans + "0");

        // Include 0
        if (lastPlace == 0) {
            removeConsicutiveOne(n - 1, 1, ans + "1");
        }
    }
    
    public static void main(String[] args) {
        int n = 3; // Change this value to generate different lengths
        removeConsicutiveOne(n,0, "");
    }
}
