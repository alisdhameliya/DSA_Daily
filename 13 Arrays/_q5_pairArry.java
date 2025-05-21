public class _q5_pairArry {
    public static void pairArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+")");   
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        pairArray(arr);
    }
}
