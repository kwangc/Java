package DigitSum;

public class DigitSum {

    public static void main(String[] args) {
        System.out.println("Sum of digits in number 125 is " + sumDigits(125));
        System.out.println("Sum of digits in number -125 is " + sumDigits(-125));
        System.out.println("Sum of digits in number 5 is " + sumDigits(5));
        System.out.println("Sum of digits in number 324069086 is " + sumDigits(324069086));
    }

    public static int sumDigits(int number) {
        if(number < 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10; // number = number / 10;
        }

        return sum;

    }

}
