package While;

public class While {

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 22;
        int count = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even Number " + number);

            count++;
            if(count >= 5){
                break;
            }

        }
        System.out.println("Number of even number found " + count);

        whilePractice();
    }


    public static boolean isEvenNumber(int number) {

        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void whilePractice() {
        int number = 0;
        while (number < 15) {
            number ++;

            if (number <= 5) {
                System.out.println("Skipping number " + number);
                continue;
            }

            System.out.println("Number " + number);

            if (number >= 10) {
                System.out.println("Breaking at " + number);
                break;
            }
        }
    }

}

