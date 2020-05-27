package Ex19;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }

        int lastDigitOfNum1 = num1 % 10;
        int lastDigitOfNum2 = num2 % 10;
        int lastDigitOfNum3 = num3 % 10;

        if (lastDigitOfNum1 == lastDigitOfNum2 || lastDigitOfNum1 == lastDigitOfNum3 || lastDigitOfNum2 == lastDigitOfNum3) {
            return true;
        }

        return false;

    }

    public static boolean isValid(int num) {
        if (num < 10 || num > 1000) {
            return false;
        }
        return true;
    }
}
