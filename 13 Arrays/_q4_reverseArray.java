public class _q4_reverseArray {
    public static void reverseArray(int arr[]){
        int start = 0 ;
        int end = arr.length -1;
        int temp;
        while (start<end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,3,8};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverseArray(arr);
    }
}
