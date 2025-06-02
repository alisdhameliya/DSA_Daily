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

    //second solution

    public static int length(String st)
    {
        if (st.length()==0) {
            return 0;
        }

        return length(st.substring(1))+1;
    }
    public static void main(String[] args) {
        String test = "alis";
        lengthOfString(0, test,new StringBuilder(""));
        System.out.println(length(test));
    }
}
