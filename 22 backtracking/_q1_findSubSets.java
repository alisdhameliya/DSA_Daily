public class _q1_findSubSets {
    public static void findSubset(String s,int i,StringBuilder ans){
        //base case
        if (i == s.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }else
            System.out.println(ans);
            return;
        }

        findSubset(s, i+1, ans.append(s.charAt(i)));
        ans.deleteCharAt(ans.length()-1);
        findSubset(s, i+1, ans);
    }
    public static void main(String[] args) {
        findSubset("abc",0,new StringBuilder(""));
    }
}
