package control;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validator {
    private static final String EMAIL_REGEX ="^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    public static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


        private static final String PHONE_NUMBER_REGEX ="^[789]\\d{9}$";

        public static boolean isValidPhoneNumber(String phoneNumber) {
            Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
            Matcher matcher = pattern.matcher(phoneNumber);
            return matcher.matches();
        }

    private static final String PASSWORD_REGEX =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";

    public static boolean isValidPassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    }


