import java.util.*;

class Quadratic {

    double a, b, c, x1, x2;
    Scanner scan = new Scanner(System.in);

    void Input() {
        System.out.println("Enter the value for a: ");
        a = scan.nextDouble();
        System.out.println("Enter the value for b: ");
        b = scan.nextDouble();
        System.out.println("Enter the value for c: ");
        c = scan.nextDouble();

    }

    void Calculate() {
        double part1;
        part1 = b * b - 4 * a * c;
        if (part1 > 0) {
            x1 = (-b + Math.sqrt(part1)) / (2 * a);
            x2 = (-b - Math.sqrt(part1)) / (2 * a);
            System.out.println("Ans= " + x1 + "," + x2);
        } else if (part1 == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println("Ans= " + x1 + "," + x2);
        } else {
            x1 = -b / (2 * a);
            x2 = Math.sqrt(x1) / (2 * a);
            System.out.println("Ans= " + x1 + "," + x2);
        }
    }
}

class Imain26 {

    public static void main(String[] args) {
        Quadratic q = new Quadratic();
        q.Input();
        q.Calculate();
    }
}