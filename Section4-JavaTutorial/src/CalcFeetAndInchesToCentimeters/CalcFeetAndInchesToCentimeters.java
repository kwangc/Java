package CalcFeetAndInchesToCentimeters;

public class CalcFeetAndInchesToCentimeters {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(157);
        String x = getDurationString(80, 100);
        System.out.println(x);
        String y = getDurationString(-5);
        System.out.println(y);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;

        }

        double centimeters = feet * 12 * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        remainingMinutes += seconds / 60;
        int remainingSeconds = seconds % 60;

        String hoursString = hours + "h ";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m ";
        if (remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = remainingSeconds + "s";
        if (remainingSeconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + minutesString + secondsString;

    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

}
