package tn.mariages.util;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
 
public class SimpleMail {
 
    public SimpleMail()
    {}
    
    public boolean SendMail(String To, String Obj, String Text)
    {
        boolean test = false;
        
        Properties props = new Properties();  
        props.put("mail.smtp.host", "smtp.gmail.com");  
        props.put("mail.smtp.auth", "true");  
        props.put("mail.debug", "true");  
        props.put("mail.smtp.port", 25);  
        props.put("mail.smtp.socketFactory.port", 25);  
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.transport.protocol", "smtp");
        Session mailSession = null;

        mailSession = Session.getInstance(props,  
                new javax.mail.Authenticator() {  
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {  
                return new PasswordAuthentication("mariages.tn@gmail.com", "xxxxxxxxxxxxx"); // change me   
           /*
                Changer le pwd puis right click > Git > Ignore > Exclude from commit
            */
            }  
        });  
        
         try {

            Transport transport = mailSession.getTransport();

            MimeMessage message = new MimeMessage(mailSession);

            message.setSubject(Obj);
            message.setFrom(new InternetAddress("mariages.tn@gmail.com"));
            String []to = new String[]{To};
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to[0]));
            String body = Text;
            message.setContent(body,"text/html");
            transport.connect();

            transport.sendMessage(message,message.getRecipients(Message.RecipientType.TO));
            transport.close();
        } catch (Exception exception) {
            test = false;
        }
        
        return test;
    }
    
  
}