package gr.codehub.string.password;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {


    private static final int MIN_PASSWORD_LENGTH = 8;
    private static final int MIN_CRITERIA = 2;
    //Password length 8 is mandatory, so the remaining criteria is 2


    protected static boolean existUppercase(String str) {
        String pattern = ".*(?=.*[A-Z]).*";
//        System.out.println(str.matches(pattern));
        return str.matches(pattern);
    }

    protected static boolean existLowercase(String str) {
        String pattern = ".*(?=.*[a-z]).*";
//        System.out.println(str.matches(pattern));
        return str.matches(pattern);
    }

    protected static boolean existNumber(String str) {
        String pattern = ".*(?=.*[0-9]).*";
//        System.out.println(str.matches(pattern));
        return str.matches(pattern);
    }

    protected static boolean existSpecialChar(String str) {
        String pattern = ".*(?=.*[@#$%^&+=]).*";
//        System.out.println(str.matches(pattern));
        return str.matches(pattern);
    }

    protected static boolean noSequenceCharacters(String str) {
        int len = str.length();
        String patternSameCharacters = "(?i)(?:([a-z0-9])\\1{2,})*";
        final Pattern p = Pattern.compile(patternSameCharacters);
        final Matcher m = p.matcher(str);
        if (m.find()) {
            // System.out.println("Matches!");
            return false;
        }


//        for (int i = 0; (i + 2) < len; i++) {
//            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2)){
//                System.out.println("same chars");
//                return false;}
//        }

        return true;

    }

    protected static boolean passwordLengthValid(String password) {
        if (password.length() >= MIN_PASSWORD_LENGTH)
            return true;
        return false;
    }

    protected static byte countCriteria(String password) {
        byte count = 0;
        if (existUppercase(password))
            count++;
        if (existLowercase(password))
            count++;
        if (existNumber(password))
            count++;
        if (existSpecialChar(password))
            count++;
        if (noSequenceCharacters(password))
            count++;
        return count;
    }

    public static boolean acceptPassword(String password) {
        if (passwordLengthValid(password) && countCriteria(password) >= MIN_CRITERIA)
            return true;
        return false;
    }

}
