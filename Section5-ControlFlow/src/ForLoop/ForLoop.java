package ForLoop;

public class ForLoop {

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int count = 0;

        for (int i = 10; i < 50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

        // Sum 3 and 5 Challenge
        int sum = 0;
        int count2 = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count2++;
                System.out.println("Number " + i + " can be divided by both 3 and 5");
                sum += i;

            }

            if (count2 == 5) {
                break;
            }
        }
        System.out.println("Sum of above number is " + sum);
    }

}