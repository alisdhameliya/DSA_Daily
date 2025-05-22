import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class _q4_inbuildSort {
    public static void main(String[] args) {
        Integer arr[] ={1,6,3,2,5};
        
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

        Arrays.sort(arr,Collections.reverseOrder());
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        // Collections.sort(arr);
    }
}
