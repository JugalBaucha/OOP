import java.util.*;

class arraySum20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the array: ");
        size = scan.nextInt();
        int[] array = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter value of " + (i + 1) + " element: ");
            array[i] = scan.nextInt();
            sum += array[i];
        }
        System.out.println(sum);

    }
}