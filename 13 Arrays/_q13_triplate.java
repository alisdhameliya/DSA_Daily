public class _q13_triplate {
    public static void findUniqueTriplate(int arr[]){
        int triplate[][] = new int[arr.length][];
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (((arr[i]+arr[j]+arr[k])==0) ) {
                        System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        findUniqueTriplate(arr);
    }
}
