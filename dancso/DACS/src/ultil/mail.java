package ultil;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class mail {

    public static void main(String[] args) {
        final String username = "phamnhuquoctrieu307@gmail.com"; // Thay bằng email của bạn
        final String password = "aezi eavp qvfl jydp"; // Thay bằng mật khẩu của bạn

        // Thiết lập các thuộc tính kết nối
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com"); // SMTP server của Gmail
        props.put("mail.smtp.port", "587");

        // Tạo Authenticator với thông tin xác thực
        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        };

        // Tạo phiên gửi email với các thuộc tính và Authenticator
        Session session = Session.getInstance(props, auth);
         for (int i=1;i<100;i++){
        try {
            // Tạo một đối tượng Message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username)); // Thay bằng email của người gửi
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("thialythikim@gmail.com")); // Thay bằng email của người nhận
            message.setSubject("Bin Dei Nè");
            message.setText("Thoa ơi Thoa Bin  dei Nè Thoa ơi Thoa Thoa ơi Thoa");

            // Gửi email
            Transport.send(message);

            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
    }
}
