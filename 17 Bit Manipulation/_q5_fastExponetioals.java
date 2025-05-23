public class _q5_fastExponetioals {
    public static int fastExponetioals(int num,int a){
        int ans = 1;
        while (a>0) {
            if ((a & 1)!=0) {
                ans = ans * num;
            }
            num= num*num;
            a = a>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExponetioals(3,5));
    }
}
