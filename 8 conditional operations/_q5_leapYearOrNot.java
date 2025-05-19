import java.util.Scanner;

public class _q5_leapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Year :");

        int year = sc.nextInt();
        if (year < 0) {
            System.out.println("not valid year.");
        }

        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("leap year.");
        } else {
            System.out.println("Not a leap year.");
        }

    }
}
