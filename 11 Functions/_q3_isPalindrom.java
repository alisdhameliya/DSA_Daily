public class _q3_isPalindrom {
    public static boolean isPalindrom(int n){
        int temp =n;
        int reveseNo = 0;
        int ld = 0;
        while (temp>0) {
            ld = (temp%10);
            reveseNo = reveseNo*10 + ld;
            temp /=10;
        }
        System.out.println(reveseNo);
        System.out.println(n);
        if (reveseNo == n) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(1112));
    }
}
