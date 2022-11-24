import java.util.*;

class Student {
    public String name;
    public int age;
    Scanner scan = new Scanner(System.in);

    public void input() {
        System.out.println("Enter the Name: ");
        name = scan.nextLine();
        System.out.println("Enter the Age for " + name + ": ");
        age = scan.nextInt();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Imain31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total no. of Students: ");
        int size = scan.nextInt();

        Student[] s;
        s = new Student[size];
        int count;
        for (count = 0; count < size; count++) {
            s[count].input();
        }
        for (count = 0; count < size; count++) {
            if (s[count].age >= 24) {
                s[count].display();
            }
        }
    }
}