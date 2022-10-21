package Ex41SortedArray;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] myIntegers2 = getIntegers(5);
        printArray(sortIntegers(myIntegers2));

    }

    public static int @NotNull [] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[number];
        System.out.println("Enter " + number + " integer values:\r");

        for (int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int @NotNull [] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contains " + array[i]);
        }
    }

    public static int @NotNull [] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;

            for(int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true; // to run until every element gets to its position
                }
            }
        }

        return sortedArray;
    }
}
