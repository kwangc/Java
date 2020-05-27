package Ex23;

public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        }

        int reversed = reverse(number);
        int count = getDigitCount(number);
        int reverseCount = getDigitCount(reversed);
        int digit;
        while (reversed > 0) {
            digit = reversed % 10;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reversed /= 10;
        }

        if (count != reverseCount) {
            for (int i=0; i < (count - reverseCount); i++) {
                System.out.println("Zero");
            }
        }

    }

    public static int reverse(int number) {

        int original = Math.abs(number);
        int reverse = 0;
        while (original > 0) {
            reverse = reverse * 10 + original % 10;
            original /= 10;
        }

        if (number < 0) {
            return -1 * reverse;
        } else if (number == 0) {
            return 0;
        }

        return reverse;

    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }

        int digit = 0;
        while (number > 0) {
            digit++;
            number /= 10;
        }

        return digit;
    }

}
