package control;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.util.Scanner;

public class get_otp {
    private static final String ACCOUNT_SID = "ACa773e6d2b7b0ed10827552086546e2fc";
    private static final String AUTH_TOKEN = "12ffa8de13162ff2da0fb40a8dc21c22";
    private static final String TWILIO_PHONE_NUMBER ="7010801441";
    public static void sendOTP(String recipientPhoneNumber, String otp) {
        try {
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            Message message = Message.creator(
                            new PhoneNumber(recipientPhoneNumber),
                            new PhoneNumber(TWILIO_PHONE_NUMBER),
                            "Indian Govt.Your OTP is: " + otp + "Use this otp to change data.Please don't share this OTP to anyone.")
                    .create();
            System.out.println("OTP sent successfully. SID: " + message.getSid());
        } catch (Exception ex) {
            System.out.println("Failed to send message: " + ex.getMessage()+"Pleae try other verification methods ");
            System.out.println("Press 1 to  verify through email");
            Scanner in_otp=new Scanner(System.in);
            int n_otp=in_otp.nextInt();
            if(n_otp==1)
            {
                String sender_mail="testration@gmail.com";
                String sender_pass="test@ration";
                String receiver_mail="sarvesarumugam003@gmail.com";


                          get_mail.send_MailOTP(sender_mail,sender_pass,receiver_mail,otp);

            }
            else
            {
                System.out.println("Resending otp through sms");

            }
        }

    }
}

