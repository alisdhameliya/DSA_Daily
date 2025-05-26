import java.util.Scanner;

class Complex {
    int real;
    int img;

    public Complex(int a,int b){
        real = a;
        img = b;
    }

    public static Complex add(Complex a,Complex b){
        return  new Complex(a.real + b.real,a.img + b.img);
    }

    public static Complex diff(Complex a,Complex b){
        return  new Complex(a.real - b.real,a.img - b.img);
    }

    public static Complex product(Complex a,Complex b){
        return  new Complex((a.real * b.real)-(a.img*b.real),(a.img * b.real)+(a.real*b.img));
    }

    public void printComplex(){
        if (real ==0 && img !=0) {
            System.out.println(img+"i");
        }else if (img == 0 && real != 0) {
            System.out.println(real);
        }else{
            System.out.println(real+"+"+img+"i");
        }
    }
}


public class _q1_Complex {
    public static void main(String[] args) {
        Complex c1 = new Complex(4,1);
        Complex c2 = new Complex(6,1);

        Complex e = Complex.add(c1,c2);
        Complex f = Complex.diff(c1,c2);
        Complex g = Complex.product(c1,c2);

        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}
