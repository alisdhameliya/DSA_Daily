public class _q2_largestAndSmallest {
    public static void largestSmallest(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]) {
                max=arr[i];
            }else if (min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("smallest :"+min);
        System.out.println("Max :"+max);
    }
    public static void main(String[] args) {
        int arr[]={23,4,25,0,89,56};
        largestSmallest(arr);
    }
}
