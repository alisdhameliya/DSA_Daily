import java.util.Scanner;

public class _q2_squareArea {
    public static void main(String[] args) {
        System.out.println("Enter side of square");
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();

        System.out.println("Area of Square is :"+side*side);
    }
}
