import java.util.*;

class Complex {
    int real, img;

    void getSum(Complex c1, Complex c2) {
        int realN = c1.real + c2.real;
        int imgN = c1.img + c2.img;

        System.out.println("Sum of Real: " + realN);
        System.out.println("Sum of Imaginary: " + imgN);
    }
}

class imain32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        c1.real = scan.nextInt();
        c2.real = scan.nextInt();
        c1.img = scan.nextInt();
        c2.img = scan.nextInt();
        Complex c = new Complex();
        c.getSum(c1, c2);
    }
}