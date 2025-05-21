public class _q7_prefixSubArrayMaxSum {
    public static void maxSubArraySum(int arr[]){
        int pref[] = new int[arr.length];
        int maxSum = Integer.MIN_VALUE;
        int currSum =0;

        pref[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            pref[i] = pref[i-1]+arr[i];
        }

        for (int i = 0; i < pref.length; i++) {
            for (int j = i; j < pref.length; j++) {
                currSum = i==0? pref[j]:pref[j]-pref[i];
                if (currSum>maxSum) {
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sub array sum :"+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,-1,4,5,6,-8};
        maxSubArraySum(arr);
    }
}
