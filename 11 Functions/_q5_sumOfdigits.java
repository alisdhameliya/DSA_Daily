public class _q5_sumOfdigits {
    public static int sumOfdigits(int n){
        int temp  = n ;
        int ld = 0;
        int sum = 0;
        while (temp>0) {
            ld = temp%10;
            sum += ld;
            temp/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfdigits(123323));
    }
}
