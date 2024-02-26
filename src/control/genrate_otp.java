package control;

public class genrate_otp{

public static String generateOTP() {

        int otpLength = 6;
        StringBuilder otp = new StringBuilder();
        for (int i = 0; i < otpLength; i++) {
        otp.append((int) (Math.random() * 10));
        }
        return otp.toString();
        }

        public static String generateEID() {

                int otpLength = 12;
                StringBuilder otp = new StringBuilder();
                for (int i = 0; i < otpLength; i++) {
                        otp.append((int) (Math.random() * 10));
                }
                return otp.toString();
        }
}

