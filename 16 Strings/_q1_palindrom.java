
public class _q1_palindrom {
    public static boolean isPalindrom(String s){
        int n = s.length();
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String name = "racecar";
        
        System.out.println(isPalindrom(name));
    }
}
