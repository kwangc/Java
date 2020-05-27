package Ex24;

public class FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(5,3,23));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (!(bigCount > -1 && smallCount > -1 && goal > -1)) {
            return false;
        }

        System.out.println(Math.min(goal/5, bigCount));
        goal -= Math.min(goal/5, bigCount) * 5;
        System.out.println(goal);
        return goal - smallCount < 1;

    }
}
