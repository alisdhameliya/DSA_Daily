import java.util.Scanner;

public class _q6_tableOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print table");
        int n = sc.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(n +" * "+i+" = "+n*i);
        }
    }
}
