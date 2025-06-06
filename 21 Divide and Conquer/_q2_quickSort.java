import java.util.Arrays;

public class _q2_quickSort {

    // Recursive QuickSort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) { // base case: if low >= high, array is already sorted
            int partIdx = partition(arr, low, high); // find pivot position

            quickSort(arr, low, partIdx - 1); // recursively sort left part
            quickSort(arr, partIdx + 1, high); // recursively sort right part
        }
    }

    // Partition function to place pivot at correct position
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // choosing pivot as the last element
        int i = low - 1; // pointer for the smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // finally, swap pivot to its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // return index of pivot
    }


    public static void quickSortKrunal(int[] arr,int low, int high){
        if (low>=high) {
            return;
        }

        int s = low;
        int e = high;
        int mid = s + (e-s)/2;
        int pivot = arr[mid];

        while (s<=e) {
            while (arr[s]<pivot) {
                s++;
            }

            while (arr[e]>pivot) {
                e--;
            }

            if (s<=e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        quickSortKrunal(arr, low, e);
        quickSortKrunal(arr, s, high);
    }

    public static void main(String[] args) {
        int[] arr = {9, 3, 4, 5, 8};
        // quickSort(arr, 0, arr.length - 1);
        quickSortKrunal(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}



