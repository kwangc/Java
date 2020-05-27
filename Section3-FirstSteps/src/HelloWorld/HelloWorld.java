package HelloWorld;

public class HelloWorld {

    public static void main(String[] args) {

        String myString = "Hello World";
        byte myByteValue = 126;
        short myShortValue = 25245;
        int myIntValue = 23576384;

        long myLastVariable = 50000L + 10L * (myByteValue + myShortValue + myIntValue);

        System.out.println(myLastVariable);
        System.out.println(myString);
    }

}
