import java.util.ArrayList;

public class _q3_maxWaterContainer {
    public static int maxContainedWater(ArrayList<Integer> hight) {
        int i = 1;
        int j = hight.size() - 1;
        int max = Integer.MIN_VALUE;
        while (i < j) {
            int minBoundry = Math.min(hight.get(i), hight.get(j));
            if (hight.get(i) < hight.get(j)) {
                i++;
            } else {
                j--;
            }
            int width = j - i+1;
            int ContainedMaxWater = minBoundry * width;

            max = Math.max(ContainedMaxWater, max);
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> hight = new ArrayList<>();
        hight.add(1);
        hight.add(8);
        hight.add(2);
        hight.add(5);
        hight.add(4);
        hight.add(7);
        hight.add(3);
        hight.add(6);
        hight.add(7);
        hight.add(1);
        System.out.println(maxContainedWater(hight));
    }
}