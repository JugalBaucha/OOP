import java.util.*;

class Rectangle {
    Scanner scan = new Scanner(System.in);
    float length;
    float breadth;
    float area;

    public void set() {
        System.out.println("Enter Length: ");
        length = scan.nextFloat();

        System.out.println("Enter Breadth: ");
        breadth = scan.nextFloat();
    }

    public void calculate() {
        area = length * breadth;
        System.out.println(area);
    }
}

class Imain25 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.set();
        rec.calculate();
    }
}