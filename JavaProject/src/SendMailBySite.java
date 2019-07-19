
public class SendMailBySite {
	 public static void main(String[] args) {
		 String message="This is a sample mail";
		 String subject="This is a sample";
		 String reciever="shanmugapriya.mickey@gmail.com";
		 String sender="transit.passapp@gmail.com";
		 String password="transit123#";
	     Mailer.send(sender,password,reciever,subject,message);  
	 }    
}
