package Ex43ReverseArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] originalArray = readIntegers(count);

        System.out.println("My original array = " + Arrays.toString(originalArray));
        int[] reversedArray = reverse(originalArray);

        System.out.println("My reversed array = " + Arrays.toString(reversedArray));

    }

    private static int[] readIntegers(int count) {

        int[] array = new int[count];

        for(int i=0; i<array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();

            array[i] = number;
        }

        return array;
    }

    private static int[] reverse(int[] array) {
        int[] copiedArray = array;

        for(int i=0; i<array.length/2; i++) {
            int digit = copiedArray[i];
            copiedArray[i] = copiedArray[array.length-i-1];
            copiedArray[array.length-i-1] = digit;
        }

        return copiedArray;
    }
}
