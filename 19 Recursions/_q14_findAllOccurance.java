public class _q14_findAllOccurance {
    public static void findAllOccurance(int count,int key,int idx,int[] arr){
        if (arr.length == idx) {
            System.out.println("count of "+key+" : "+count);
            return;
        }
        if (arr[idx] == key) {
            System.out.print(idx+" ");
            count++;
        }
        
        findAllOccurance(count, key, idx+1, arr);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,2,4,2,2};
        findAllOccurance(0, 2, 0, arr);
    }
}
