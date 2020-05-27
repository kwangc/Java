package Ex7;

public class TeenNumberChecker {

    public static boolean hasTeen(int a, int b, int c) {
        if (13 <= a && a <= 19) {
            return true;
        } else if (13 <= b && b <= 19) {
            return true;
        } else if (13 <= c && c <= 19) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int d) {
        if (13 <= d && d <= 19) {
            return true;
        }
        return false;
    }

}
