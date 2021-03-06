import java.util.Scanner;

public class BinarySearchWithoutRecursion {
    private static int binarySearchWithoutRecursion(int[] array, int findNumber) {
        int left = 0;
        int right = array.length - 1;

        while (true) {
            int middle = (right + left) / 2;

            if (left > right) {
                return -1;
            }

            if (findNumber > array[middle]) {
                left = middle + 1;
            } else if (findNumber < array[middle]) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number whose index you want to find: ");
        int findNumber = scanner.nextInt();

        int[] array = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        System.out.println(binarySearchWithoutRecursion(array, findNumber));
    }
}
