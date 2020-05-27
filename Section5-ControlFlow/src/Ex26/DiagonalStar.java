package Ex26;

public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(5);
        printSquareStar(8);
        printSquareStar(10);
    }

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 0; i < number; i++) {              //i = Row #
            for (int j = 0; j < number; j++) {          //j = Column #
                if (i == 0 || i == (number-1) || j == 0 || j == (number-1) || i == j || i == number - (j+1)) {
                    System.out.append("*");
                } else {
                    System.out.append(" ");
                }
            }
            System.out.println();
        }
    }

}