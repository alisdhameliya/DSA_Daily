public class _q1_bubbleSort {
    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                // Descending order
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];  
                    arr[j+1] = temp;
                }
            }
        }
        // Print sorted array at the end
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,6,3,2,5};
        bubbleSort(arr);
    }
}