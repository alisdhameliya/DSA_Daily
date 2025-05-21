public class _q1_linearSearch {
    public static int linearSearch(int arr[],int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,3,4,6,1,2,6};
        int index = linearSearch(arr, 6);
        if (index<0) {
            System.out.println("NOT Found");
        }else{
            System.out.println("Index of key in array is :"+index);
        }
    }
}
