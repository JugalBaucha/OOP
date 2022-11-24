import java.util.*;

class Quadratic {
    Scanner scan = new Scanner(System.in);
    Double a, b, c, x1, x2;

    void Input() {
        System.out.println("Enter the value for a,b and c: ");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
    }

    double[] Calculate() {

        x1 = b * b - 4 * a * c;
        if (x1 > 0) {
            x1 = (-b + Math.sqrt(x1)) / (2 * a);
            x2 = (-b - Math.sqrt(x1)) / (2 * a);
            System.out.println("Ans= " + x1 + "," + x2);
        } else if (x1 == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println("Ans= " + x1 + "," + x2);
        } else {
            x1 = -b / (2 * a);
            x2 = Math.sqrt(x1) / (2 * a);
            System.out.println("Ans= " + x1 + "," + x2);
        }
        return null;
    }
}

class imain30 {

    public static void main(String[] args) {
        Quadratic q = new Quadratic();
        q.Input();
        q.Calculate();
    }
}