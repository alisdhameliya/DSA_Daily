public class _q4_stringCompression {
    public static String compressedString(String s){
        String compress = "";
        for (int i = 0; i < s.length(); i++) {
            
            Integer count=1;
            while ( i<s.length()-1 && s.charAt(i) == s.charAt(i+1) ) {
                count++;
                i++;
            }
            compress += s.charAt(i);
            if (count>1 ) {
                compress += count.toString();
            }

        }
        return compress;
    }
    public static void main(String[] args) {
        String demo = "aaabbccccccdd";

        System.out.println(compressedString(demo));
    }
}
