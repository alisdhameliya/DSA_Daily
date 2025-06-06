public class _q5_mejorityElem {

    public static int majorityElem(int[] arr){
        int count =0;
        int candidate = 0;

        for(int num: arr){
            if (count == 0 ) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            }else{
                count--;
            }
        }

        return candidate;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2,2,1,1};
        int arr2[] ={3,2,3};
        System.out.println(majorityElem(arr));
        System.out.println(majorityElem(arr2));

    }
}
