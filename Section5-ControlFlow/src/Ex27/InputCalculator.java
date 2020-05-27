package Ex27;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner s = new Scanner(System.in);

        int sum = 0;
        long avg = 0;
        int count = 0;
        boolean first = true;

        while (true) {
            count++;
            boolean isAnInt = s.hasNextInt();

            if (isAnInt) {
                int number = s.nextInt();

                if (first) {
                    first = false;
                    sum = number;
                    avg = number;
                } else {
                    sum += number;
                    avg = Math.round((double) sum / count);
                }

            } else {
                break;
            }

            s.nextLine();

        }

        s.close();
        System.out.println("SUM = " + sum + " AVG = " + avg);

    }

}
