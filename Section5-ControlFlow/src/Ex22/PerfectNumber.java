package Ex22;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(0));
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(100));

    }
    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int divisor = 1;
        int sum = 0;
        while (divisor < number) {
            if (number % divisor == 0) {
                sum += divisor;
            }
            divisor ++;
        }

        if (sum == number) {
            return true;
        }

        return false;

    }

}
