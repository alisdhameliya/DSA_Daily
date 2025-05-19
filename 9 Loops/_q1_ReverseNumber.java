
public class _q1_ReverseNumber {
    public static void main(String[] args) {
        int n = 231;
        int ld = 0;
        int temp = n;
        int reverse =0;
        while (temp>0) {
            ld = temp%10;
            reverse = reverse*10 + ld;
            temp /= 10;
        }
        System.out.println(reverse);
    }
}
