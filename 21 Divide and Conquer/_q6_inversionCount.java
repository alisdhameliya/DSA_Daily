public class _q6_inversionCount {
    public static int inversionCount(int arr[]){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[i]>arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr ={2,4,1,3,5};
        int[] arr1 ={2,3,4,5,6};
        int[] arr2 ={5,5,5};
        System.out.println(inversionCount(arr));
        System.out.println(inversionCount(arr1));
        System.out.println(inversionCount(arr2));
    }
}
