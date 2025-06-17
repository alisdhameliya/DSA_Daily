import java.util.ArrayList;

public class _q2_multi_dimentioal {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainArr = new ArrayList<>();
        ArrayList<Integer> subArr1 = new ArrayList<>();
        ArrayList<Integer> subArr2 = new ArrayList<>();
        ArrayList<Integer> subArr3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            subArr1.add(i * 1);
            subArr2.add(i * 2);
            subArr3.add(i * 3);
        }

        mainArr.add(subArr1);
        mainArr.add(subArr2);
        mainArr.add(subArr3);

        System.out.println(mainArr);
    }
}
