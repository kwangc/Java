package Ex18;

public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {

        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }

        int digitOfA = a % 10;
        int digitOfB = b % 10;

        if (digitOfA == digitOfB) {
            return true;
        } else if (digitOfA == b / 10) {
            return true;
        } else if (a / 10 == digitOfB) {
            return true;
        } else if (a / 10 == b / 10) {
            return true;
        }

        return false;

    }
}
