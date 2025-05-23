public class _q2_Oprations {

    public static int getBit(int num,int i){
        int bitMask = 1<<i;
        if ((num & bitMask)==0) {
            return 0;
        }else{
            return 1;
        }
    }

    public static int setBit(int num, int i){
        int bitMask = 1<<i;
        return num|bitMask;
    }

    public static int clearBit(int num,int i){
        int bitMask = ~(1<<i) ;
        return num & bitMask;
    }

    public static int updateBit(int num, int i,int newBit){
        int bitMask = ~(1<<i);
        num = num & bitMask;
        return num | (newBit<<i);
    }

    public static int clearLastIbit(int num, int i){
        int bitMask = (~(0)<<i);
        return num&bitMask;
    }

    public static int ClearRangeOfBit(int num, int i,int j){
        int aMask = ((~0)<<j+1);
        int bMask = ~((~0)<<i);  //(1 << i) - 1
        
        return num & (aMask|bMask);
    }

    
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Nthbit is "+getBit(num, 4));
        System.out.println("set ith bit "+setBit(num, 4));
        System.out.println("Clear ith  bit "+clearBit(num, 1));
        System.out.println("Update ith  bit "+updateBit(num, 2,1));
        System.out.println("Clear Last ith  bit "+clearLastIbit(31, 1));
        System.out.println("Clear Last ith  bit "+ClearRangeOfBit(31, 1,3   ));
        
    }
}
