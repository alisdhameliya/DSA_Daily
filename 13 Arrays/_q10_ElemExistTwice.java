public class _q10_ElemExistTwice {
    public static boolean isAnyExistTwice(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // int nums[] = {1,2,3,1};
        // int nums[] = {1,2,3,4};
        int nums[] = {2,3,3,2,3,4};
        // int nums[] = {1,1,1,3,3,2,3,4};
        System.out.println(isAnyExistTwice(nums));
    }
}
