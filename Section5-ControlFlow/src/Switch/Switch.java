package Switch;

public class Switch {

    public static void main(String[] args) {

//        int value = 3;
//        if(value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 6;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1,2,3,4 or 5");
                break;
        }

        char switchChar = 'd';

        switch (switchChar) {
            case 'a':
                System.out.println("Value was a");
                break;
            case 'b':
                System.out.println("Value was b");
                break;
            case 'c': case 'd': case 'e':
                System.out.println("Value was " + switchChar);
                break;
            default:
                System.out.println("a,b,c,d or e was not typed");
        }

        String month = "OctoBer";

        switch (month.toLowerCase()) {
            case "october":
                System.out.println("oct");
                break;
            case "december":
                System.out.println("dec");
                break;
            default:
                System.out.println("not sure");
        }

    }

}
