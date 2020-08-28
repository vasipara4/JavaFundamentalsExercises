package gr.codehub.algorithms;

public class Digits {

    public static int countDigits(long n) {
        return Long.toString(n).length();
    }

    public static String decimalPart(float n) {
        String number = Float.toString(n);
        String result;
        int integerPlaces = number.indexOf('.');
        result = "0" + number.substring(integerPlaces);
        return result;
    }
}
