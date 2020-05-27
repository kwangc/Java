package DayOfTheWeek;

public class DayOfTheWeek {

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } else {

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                case 2:
                    if (isLeapYear(year) == true) {
                        return 29;
                    }
                    return 28;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        getDaysInMonth(1, 2020);
        getDaysInMonth(2, 2020);
        getDaysInMonth(2, 2018);
        getDaysInMonth(-1, 2020);
        getDaysInMonth(1, -2020);

        int day2 = 3;

        if (day2 == 0) {
            System.out.println("Monday");
        } else if (day2 == 1) {
            System.out.println("Tuesday");
        } else if (day2 == 2) {
            System.out.println("Wednesday");
        } else if (day2 == 3) {
            System.out.println("Thursday");
        } else if (day2 == 4) {
            System.out.println("Friday");
        } else if (day2 == 5) {
            System.out.println("Saturday");
        } else if (day2 == 6) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day");
        }
    }

}
