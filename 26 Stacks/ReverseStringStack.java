import java.util.Stack;

public class ReverseStringStack {

    public static String reverseStringStack(String str){
        Stack s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "abc";
        String result = reverseStringStack(str);
        System.out.println(result);
    }
}
