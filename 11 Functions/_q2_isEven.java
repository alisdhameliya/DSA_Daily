import java.util.Scanner;

public class _q2_isEven {
    public static boolean isEven(int n){
        if (n%2==0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isEven(3));
    }
}
