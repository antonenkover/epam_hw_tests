
public class CountLength {

    public static int countByteLength () {
        byte byteNum = 1;
        int counter = 0;
        while (byteNum != 0) {
            byteNum = (byte) ( byteNum << 1);
            counter++;
        }
        return counter;
    }

    public static int countIntegerLength () {
        int intNum = 1;
        int counter = 0;
        while (intNum != 0) {
            intNum = intNum << 1;
            counter++;
        }
        return counter;
    }

    public static int countShortLength () {
        short shortNum = 1;
        int counter = 0;
        while (shortNum != 0) {
            shortNum = (short) (shortNum << 1);
            counter++;
        }
        return counter;
    }

    public static int countLongLength () {
        long longNum = 1;
        int counter = 0;
        while (longNum != 0) {
            longNum = longNum << 1;
            counter++;
        }
        return counter;
    }
}
