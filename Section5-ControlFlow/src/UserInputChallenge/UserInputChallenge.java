package UserInputChallenge;

import java.util.Scanner;

public class UserInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while(count <= 10) {
            System.out.println("Enter number #" + count + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int userInput = scanner.nextInt();
                sum += userInput;
                count++;
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine(); // handle end of line (enter key)
        }

        System.out.println("Sum of all of your input: " + sum);
        scanner.close();
    }

}


