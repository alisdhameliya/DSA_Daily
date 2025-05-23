public class _q3_powerOrNot {

    public static boolean powerOrNot(int num){
        return (num & (num-1)) == 0;
    }
    public static void main(String[] args) {
        int num = 12;
        System.out.println(powerOrNot(num));
    }   
}
