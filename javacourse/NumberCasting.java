package javacourse;

public class NumberCasting {
    public static void main(String[] args) {

        byte byteValue = 3;
        short shortValue = 38;
        int intValue = 29;
        long longValue = 93024;

        float floatValue = 923.5f;
        double doubleValue = 2341.4;

        System.out.println(Byte.MAX_VALUE);

        intValue = (int) longValue;
        System.out.println(intValue);

        intValue = (int) floatValue;
        System.out.println(intValue);

    }
}
