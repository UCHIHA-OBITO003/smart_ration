package control;



        import java.util.Properties;
        import javax.mail.*;
        import javax.mail.internet.*;

public class get_mail {

    public static void send_MailOTP(String senderEmail, String senderPassword, String recipientEmail, String otps) {

        String otp = otps;

        // Email configuration
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Create a Session object with authentication
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            // Create a message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject("Your OTP");
            message.setText("Your OTP is: " + otp);

            // Send the message
            Transport.send(message);

            System.out.println("OTP sent successfully to " + recipientEmail);
        } catch (MessagingException e) {
            System.out.println("Error occurred while sending OTP: " + e.getMessage());
            e.printStackTrace();
        }
    }



}
