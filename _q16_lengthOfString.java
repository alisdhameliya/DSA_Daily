public class _q16_lengthOfString {
    public static void lengthOfString(int i,String st,StringBuilder temp){
        if (st.equals(temp.toString())) {
            System.out.println("length of string is : "+i);
            return ;
        }
        temp.append(st.charAt(i));
        i =i+1;
        lengthOfString(i, st,temp);
    }
    public static void main(String[] args) {
        String test = "alis";
        lengthOfString(0, test,new StringBuilder(""));
    }
}
