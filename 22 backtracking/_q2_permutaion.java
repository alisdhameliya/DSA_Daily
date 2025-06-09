public class _q2_permutaion {
    public static void permutation(String s,String ans){
        if (s.length()==0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            String newString = s.substring(0, i)+s.substring(i+1);
            permutation(newString, ans+curr);
        }
    }
    public static void main(String[] args) {
        permutation("abc", "");
    }
}
