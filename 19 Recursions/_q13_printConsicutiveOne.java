public class _q13_printConsicutiveOne {
    public static void printConsecutiveOnes(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }

        // Include 1
        printConsecutiveOnes(n - 1, ans + "1");

        // Include 0
        if (ans.length() == 0 || ans.charAt(ans.length() - 1) != '0') {
            printConsecutiveOnes(n - 1, ans + "0");
        }
    }
    public static void main(String[] args) {
        int n = 3; // Change this value to generate different lengths
        printConsecutiveOnes(n, "");
    }
}
