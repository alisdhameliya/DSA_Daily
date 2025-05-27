public class _q8_lastOccurence {
    public static int lastOccurence(int arr[],int key,int i){
        if (i == -1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        
        return lastOccurence(arr, key, i-1);
    }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,2,5,5};
        System.out.println(lastOccurence(arr, 2, arr.length-1));
    }
}
