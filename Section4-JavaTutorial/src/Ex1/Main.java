package Ex1;

public class Main extends SpeedConverter {

    public static void main(String[] args) {

        long miles1 = toMilesPerHour(1.5);
        System.out.println(miles1);
        long miles2 = toMilesPerHour(10.25);
        System.out.println(miles2);
        long miles3 = toMilesPerHour(-5.6);
        System.out.println(miles3);
        long miles4 = toMilesPerHour(25.42);
        System.out.println(miles4);
        long miles5 = toMilesPerHour(75.114);
        System.out.println(miles5);

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);

    }

}
