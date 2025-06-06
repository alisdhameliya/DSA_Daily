import java.util.Arrays;

public class _q4_mergeSortForString {
    public static void mergeSortForString(String[] arr,int si,int ei){
        if (si<ei) {
            int mid = si + (ei-si)/2;

            mergeSortForString(arr,si,mid);
            mergeSortForString(arr, mid+1, ei);

            merge(arr, si,mid, ei);
        }
    }

    public static void merge(String[] arr,int si,int mid ,int ei){
        int n1 = mid - si +1;
        int n2 = ei - mid;
        String[] L = new String[n1];
        String[] R = new String[n2];


        for (int i = 0; i < L.length; i++) {
            L[i] = arr[si+i];
        }

        for (int i = 0; i < R.length; i++) {
            R[i] = arr[mid+1+i];
        }

        int i =0,j=0;

        int k = si;

        while (i<n1 && j<n2) {
            if (L[i].compareTo(R[j]) <=0) {
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i<n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j<n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        String[] arr = {"earth","sun","mars","mercury"};

        mergeSortForString(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
}
