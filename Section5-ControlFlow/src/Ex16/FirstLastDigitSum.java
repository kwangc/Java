package Ex16;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(525));
        System.out.println(sumFirstAndLastDigit(-1));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(12345));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int first = number % 10;
        int last = 0;

        while (number > 0) {
            last = number % 10;
            number /= 10;
        }
        return first + last;
    }
}
