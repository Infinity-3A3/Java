/*
 * Copyright (C) 2014 omar
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package tn.mariages.gui;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author omar
 */
public class Mail  {
    public static boolean sendMail(String from,String to[],String password,String message) throws MessagingException
    {
        String host="smtp.gmail.com";
        Properties props = System.getProperties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", password);
        props.put("mail.smtp.port", 587);
        props.put("mail.smtp.auth", "true");
        Session session =  Session.getDefaultInstance(props,null);
        Message mimeMessage = new MimeMessage(session);
        try {
            mimeMessage.setFrom(new InternetAddress(from));
            InternetAddress[] toAddresses= new InternetAddress[to.length];
            
            for(int i=0;i<to.length;i++)
            {
                toAddresses[i]=new InternetAddress(to[i]);
            }
            
            for(int i=0;i<toAddresses.length;i++)
            {
                mimeMessage.addRecipient(Message.RecipientType.TO, toAddresses[i]);
            }
            
            mimeMessage.setText(message);
            Transport transport= session.getTransport("smtp");
            transport.connect(host,from,password);
            transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
            transport.close();
            return true;
            
            
            
        } catch (AddressException ex) {
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
}
