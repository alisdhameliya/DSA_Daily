import java.util.Scanner;

public class _q3_bill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price of Pen:");
        float pen = sc.nextFloat();
        System.out.println("Enter price of Pencile:");
        float pencile = sc.nextFloat();
        System.out.println("Enter price of Eraser:");
        float eraser = sc.nextFloat();
        
        float total = (pen+pencile+eraser);
        System.out.println("Total cost = "+total);
        System.out.println("With GST bill= "+(total+total*0.18));
    }
}
