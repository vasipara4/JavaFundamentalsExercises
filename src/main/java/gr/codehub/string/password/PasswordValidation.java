package gr.codehub.string.password;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {


    //Constants Declaration
    private static final int MIN_PASSWORD_LENGTH = 8;
    //Password length = 8 is mandatory, so the remaining criteria are 2
    private static final int MIN_CRITERIA = 2;



    protected static boolean existUppercase(String str) {
        String pattern = ".*(?=.*[A-Z]).*";
        //System.out.println(str.matches(pattern));
        return str.matches(pattern);
    }

    protected static boolean existLowercase(String str) {
        String pattern = ".*(?=.*[a-z]).*";
        //System.out.println(str.matches(pattern));
        return str.matches(pattern);
    }

    protected static boolean existNumber(String str) {
        String pattern = ".*(?=.*[0-9]).*";
        //System.out.println(str.matches(pattern));
        return str.matches(pattern);
    }

    protected static boolean existSpecialChar(String str) {
        String pattern = ".*(?=.*[@#$%^&+=]).*";
        //System.out.println(str.matches(pattern));
        return str.matches(pattern);
    }


    //    Returns TRUE if there is NOT a sequence of 3 identical/sequential characters
    //    (identical CASE_INSENSITIVE or sequential ascii characters)
    protected static boolean noSequenceCharacters(String str) {
        int len = str.length();

        //Below string - pattern tested and does not work properly
        //String patternSameCharacters = "(?i)(?:([a-z0-9])\\1{2,})*";
        //final Pattern p = Pattern.compile(patternSameCharacters);

        //Pattern for 3 or more consecutive identical characters/numbers
        Pattern p = Pattern.compile("([a-z\\d])\\1\\1", Pattern.CASE_INSENSITIVE);
        final Matcher m = p.matcher(str);

        //Detect 3 same characters in sequence
        if (m.find()) {
            System.out.println("Match");
            return false;
        }


        // Detect 3 sequential ASCII characters (Only A-Za-z characters)
        //        ASCII chars to numbers: A-> 65, X->88 , a->97, x->120
        for (int i = 0; (i + 2) < len; i++) {
            int firstStepChar = str.charAt(i);
            int secondStepChar = str.charAt(i + 1);
            int thirdStepChar = str.charAt(i + 2);

            if ((firstStepChar >= 65 && firstStepChar <= 88) || (firstStepChar >= 97 && firstStepChar <= 120)) {
                if (firstStepChar == secondStepChar - 1 && secondStepChar == thirdStepChar - 1)
                    return false;
            }
        }

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
