import java.util.*;

public class _q1_findMax {
    public static int findMax(List<Integer> arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.size(); i++) {
            // if (arr.get(i) > max) {
            // max = arr.get(i);
            // }

            max = Math.max(max, arr.get(i));
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(findMax(list));
    }
}
