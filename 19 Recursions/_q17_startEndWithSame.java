public class _q17_startEndWithSame {
    public static int startEndWithSameSubstring(int start,int end,String st){
        if (start>=st.length()) {
            return 0;
        }
        if (end>=st.length()) {
            return startEndWithSameSubstring(start+1, start+1, st);
        }

        int currunt = (st.charAt(start) == st.charAt(end)) ? 1 : 0;
        return currunt + startEndWithSameSubstring(start, end+1, st);

    }
    public static void main(String[] args) {
       System.out.println(startEndWithSameSubstring(0, 0, "abcab"));
    }
}
