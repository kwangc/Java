package Ex11;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (summer) {
            if (25 <= temperature && temperature <= 45) {
                return true;
            }
        } else {
            if (25 <= temperature && temperature <= 35) {
                return true;
            }
        }
        return false;
    }

}
