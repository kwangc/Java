package Ex15;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(-606));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(6574));
    }

    public static boolean isPalindrome(int number) {

        number = Math.abs(number);
        int reverse = 0;
        int original = number;

        while (original > 0) {
            reverse = reverse * 10 + original % 10;
            original /= 10;
        }

        System.out.println(number);
        System.out.println(reverse);

        return number == reverse;
    }
}
