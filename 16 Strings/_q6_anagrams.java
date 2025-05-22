public class _q6_anagrams {
    public static boolean isAnagrams(String a,String b){
        if (a.length() != b.length()) {
            return false;
        }

        int count[] =new int[256];

        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i)]++;
        }

        for (int index = 0; index < b.length(); index++) {
            count[b.charAt(index)]--;

            if (count[b.charAt(index)]<0) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String a ="alis";
        String b ="sqia";
        
        System.out.println(isAnagrams(a, b));
    }
}
