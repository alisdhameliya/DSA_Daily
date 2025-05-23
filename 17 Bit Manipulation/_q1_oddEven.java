
public class _q1_oddEven {
    public static boolean isOddOrEven(int num){
        if ((num & 1) ==0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        if (isOddOrEven(0)) {
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number.");
        }
    }
    
}
