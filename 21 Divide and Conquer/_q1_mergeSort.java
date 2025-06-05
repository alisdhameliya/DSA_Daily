
public class _q1_mergeSort {
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(int[] arr,int si,int ei){
        int mid = si + (ei-si)/2;

        if (si>=ei) {
            return;
        }

        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr,si,mid,ei);
    }

    public static void merge(int[] arr,int si,int mid,int ei){
        int[] temp = new int[ei-si+1]; 
        int i = si; //index for first sorted part
        int j = mid+1; //idx for 2nd sorted part
        int k = 0;  //idx for temp

        while (i<=mid && j<=ei) {
            if (arr[i]<arr[j]) {
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i<=mid) {
            temp[k++] = arr[i++];
        }

        while (j<=ei) {
            temp[k++] = arr[j++];
        }

        for (k= 0,i=si; k < temp.length; k++,i++) {
            arr[i] = temp[k];
        }

        
    }

    public static void main(String[] args) {
        int[] arr = {7,1,2,3,4,5,6};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
