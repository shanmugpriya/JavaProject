
import java.util.Properties;    
import javax.mail.*;    
import javax.mail.internet.*;    
class Mailer{  
    public static void send(String from,String password,String to,String sub,String msg){     
          Properties props = new Properties(); 
          props.put("mail.smtp.starttls.enable", "true");
          props.put("mail.smtp.port", "587");
          props.put("mail.smtp.auth", "true"); 
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.port", "587");      
          Session session = Session.getDefaultInstance(props,    
           new javax.mail.Authenticator() {    
           protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication(from,password); 
           }    
          });    
          try {    
           MimeMessage message = new MimeMessage(session);    
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));    
           message.setSubject(sub);    
           message.setText(msg);    
           Transport.send(message);    
           System.out.println("message sent successfully");    
          } catch (MessagingException e) {
          e.printStackTrace();
          
          }    
             
    }  
}  