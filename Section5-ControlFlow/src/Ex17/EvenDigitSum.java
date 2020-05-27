package Ex17;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int digit;
        while (number > 0) {
            digit = number % 10;
            number /= 10;
            if (digit % 2 != 0) {
                continue;
            }
            sum += digit;
        }

        return sum;
    }

}
