import java.util.Scanner;

public class _q4_sumOfoddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int evenSum = 0;
        int OddSum = 0;
        int n = 0;

        while (true) {
            System.out.println("enter a number:");
            n = sc.nextInt();
            if (n % 2 == 0) {
                evenSum += n;
            } else {
                OddSum += n;
            }
            System.out.println("Even sum :" + evenSum);
            System.out.println("Odd sum :" + OddSum);
        }
    }
}
