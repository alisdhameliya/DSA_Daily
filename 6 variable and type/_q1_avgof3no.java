import java.util.*;

public class _q1_avgof3no {
    public static void main(String[] args) {
        System.out.println("Enter three numbers:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        double average = (num1 + num2 + num3) / 3;
        System.out.println("The average is: " + average);
    }
}
