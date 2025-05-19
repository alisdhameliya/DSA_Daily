import java.util.*;
public class _q1_positiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        double n = sc.nextDouble();

        if(n>0){
            System.out.println("Positive number : "+n);
        }else if (n==0) {
            System.out.println("Number is 0");
        }else{
            System.out.println("number is negative :"+n);
        }
    }
}
