public class _q6_subArray {
    public static void continuousSubArry(int arr[]){
        int subArryCount=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <=j; k++) {
                    System.out.print(arr[k]+" ");
                }
                subArryCount++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArrys: "+subArryCount);
    }
    public static void continuousSubArrySum(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int tempSum = 0;
                for (int k = i; k <=j; k++) {
                    System.out.print(arr[k]+" ");
                    tempSum+=arr[k];
                }
                System.out.print("Sum :"+tempSum);
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        // continuousSubArry(arr);
        continuousSubArrySum(arr);
    }
}
