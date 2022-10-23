package Ex43ReverseArray;

import java.util.Arrays;

import static Ex42MinimumElement.MinimumElement.readElements;
import static Ex42MinimumElement.MinimumElement.readInteger;

public class ReverseArray {

    public static void main(String[] args) {

        int[] originalArray = readElements(readInteger());
        reverse(originalArray);

    }

    private static void reverse(int[] array) {
        int[] copiedArray = array;
        System.out.println("Array = " + Arrays.toString(array));

        for(int i=0; i<array.length/2; i++) {
            int digit = copiedArray[i];
            copiedArray[i] = copiedArray[array.length-i-1];
            copiedArray[array.length-i-1] = digit;
        }

        System.out.println("Reversed array = " + Arrays.toString(copiedArray));
    }
}
