package com.water.longparams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;

public class BirthdayService {

    public void sendGreetings(String fileName, Date xDate, String smtpHost, int smtpPort) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String str = "";
        str = in.readLine(); // skip header
        while ((str = in.readLine()) != null) {
            String[] employeeData = str.split(", ");
            Employee employee = new Employee(employeeData[1], employeeData[0], employeeData[2], employeeData[3]);
            if (employee.isBirthday(xDate)) {
                String recipient = employee.getEmail();
                String body = "Happy Birthday, dear %NAME%".replace("%NAME%", employee.getFirstName());
                String subject = "Happy Birthday!";
                sendMessage(smtpHost, smtpPort, "sender@here.com", subject, body, recipient);
            }
        }
    }

    private void sendMessage(String smtpHost, int smtpPort, String sender, String subject, String body, String recipient) {
        // Create a mail session
        java.util.Properties props = new java.util.Properties();
        props.put("mail.smtp.host", smtpHost);
        props.put("mail.smtp.port", "" + smtpPort);
        Session session = Session.getInstance(props, null);

        // Construct the message
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(sender));
        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
        msg.setSubject(subject);
        msg.setText(body);

        // Send the message
        Transport.send(msg);
    }
}
