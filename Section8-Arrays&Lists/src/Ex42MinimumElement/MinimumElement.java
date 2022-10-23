package Ex42MinimumElement;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {

        int[] myArray = readElements(readInteger());
        int myMinimumNumber = findMin(myArray);

        System.out.println("min = " + myMinimumNumber);

    }

    public static int readInteger() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        return count;
    }

    public static int @NotNull [] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];

        for(int i=0; i<array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();

            array[i] = number;
        }

        return array;
    }

    @Contract(pure = true)
    private static int findMin(int @NotNull [] array) {
        int min = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++) {
            int value = array[i];

            if (value < min) {
                min = value;
            }
        }

        return min;
    }
}
