public class _q11_removeDuplicate {
    public static void removeDuplicate(String str,int idx,StringBuilder newString, boolean[] map){
        if (str.length() == idx) {
            System.out.println(newString.toString());
            return;
        }
        char currChar = str.charAt(idx);

        if (map[currChar-'a']==true) {
            removeDuplicate(str, idx+1, newString, map);
        }else{
            map[currChar-'a'] = true;
            removeDuplicate(str, idx+1, newString.append(currChar), map);
        }

    }

    public static void main(String[] args) {
        removeDuplicate("aaaabbbbcccc", 0, new StringBuilder(""), new boolean[26]);
    }
}
