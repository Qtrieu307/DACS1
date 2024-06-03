/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultil;

/**
 *
 * @author phamn
 */


import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

public class guii extends JFrame{

    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Email Sender");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create and add components to frame
        JLabel toLabel = new JLabel("To:");
        toLabel.setBounds(20, 20, 100, 25);
        frame.add(toLabel);

        JTextField toField = new JTextField();
        toField.setBounds(120, 20, 200, 25);
        frame.add(toField);

        JLabel subjectLabel = new JLabel("Subject:");
        subjectLabel.setBounds(20, 60, 100, 25);
        frame.add(subjectLabel);

        JTextField subjectField = new JTextField();
        subjectField.setBounds(120, 60, 200, 25);
        frame.add(subjectField);

        JLabel bodyLabel = new JLabel("Body:");
        bodyLabel.setBounds(20, 100, 100, 25);
        frame.add(bodyLabel);

        JTextArea bodyArea = new JTextArea();
        bodyArea.setBounds(120, 100, 200, 100);
        frame.add(bodyArea);

        JButton sendButton = new JButton("Send");
        sendButton.setBounds(150, 220, 100, 25);
        frame.add(sendButton);

        // Add action listener to the send button
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String to = toField.getText();
                String subject = subjectField.getText();
                String body = bodyArea.getText();

                // Email credentials
                final String username = "phamnhuquoctrieu307@gmail.com"; // Thay bằng email của bạn
                final String password = "aezi eavp qvfl jydp"; // Thay bằng mật khẩu của bạn

                // Set up the SMTP properties
                Properties props = new Properties();
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.host", "smtp.gmail.com");
                props.put("mail.smtp.port", "587");

                // Create Authenticator
                Authenticator auth = new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                };

                // Create session
                Session session = Session.getInstance(props, auth);

                try {
                    // Create a message
                    Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(username));
                    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
                    message.setSubject(subject);
                    message.setText(body);

                    // Send the message
                    Transport.send(message);

                    JOptionPane.showMessageDialog(frame, "Email sent successfully!");

                } catch (MessagingException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(frame, "Failed to send email!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Display the frame
        frame.setVisible(true);
    }

   
}
