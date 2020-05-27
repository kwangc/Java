package Ex20;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(15,25));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
        System.out.println(getGreatestCommonDivisor(10,1010));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }
        int CommonDivisor = 0;
        int minOfTwo = Math.min(first, second);
        for (int i = minOfTwo; i > 0; i--) {
            if (first % i == 0 && second % i == 0) {
                CommonDivisor = i;
                break;
            }
        }

        return CommonDivisor;
    }
}
