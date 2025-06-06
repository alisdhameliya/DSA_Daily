public class _q3_findElemRotatedArr {

    public static int findElementInRotatedArray(int[] arr,int s,int e,int tar){
        if (s>e) {
            return -1;
        }

        int m = s + (e-s)/2;

        if (arr[m]==tar) {
            return m;
        }


        if (tar<=arr[m] && arr[s]<=tar) {
                return findElementInRotatedArray(arr, s, m-1, tar);
            }else{
                return findElementInRotatedArray(arr, m+1, e, tar);
            }
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(findElementInRotatedArray(arr, 0, arr.length-1, 0));
    }
}
