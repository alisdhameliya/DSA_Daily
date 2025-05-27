public class _q2_Incrising {
    public static void incrising(int n){
        if (n==1) {
            System.out.print(1+" ");
            return;
        }
        incrising(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        incrising(10);
    }
}
