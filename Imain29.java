import java.util.*;

class ArraySum {
    int sum;

    int Sum(int[] a) {
        int count;
        int size = a.length;
        for (count = 0; count < size; count++) {
            sum = a[count] + sum;
        }
        return sum;
    }
}

class Imain29 {
    public static void main(String[] args) {
        // finding array size now ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();

        // Now storing in the array:
        int count;
        int[] a = new int[size];
        for (count = 0; count < size; count++) {
            System.out.println("array (" + (count + 1) + "): ");
            a[count] = scan.nextInt();
        }
        ArraySum summer = new ArraySum();
        int sum1 = summer.Sum(a);
        System.out.println(sum1);
    }
}