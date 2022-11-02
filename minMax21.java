import java.util.*;

public class minMax21 {
    public static void main(String[] args) {
        // creating an array
        Scanner scan = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of the array: ");
        size = scan.nextInt();
        int[] array = new int[size];

        int i;
        for (i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " Element: ");
            array[i] = scan.nextInt();
        }
        int min, max;
        min = array[0];
        max = array[0];
        for (i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i] < array[j]) {
                    min = array[i];
                    max = array[j];
                } else if (array[i] > array[j]) {
                    max = array[i];
                    min = array[j];
                }
            }
        }
        System.out.println("Min =" + min + " \nMax= " + max);

    }
}