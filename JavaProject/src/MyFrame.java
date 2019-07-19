import javax.swing.JFrame;
 
public class MyFrame extends JFrame {
	private static final long serialVersionUID = 1L;

public MyFrame(){
     super("Student Details");
     setSize(2500,500);
     setLocationRelativeTo(null);
     AdminDisplayPage pane = new AdminDisplayPage();
  add(pane);
}
}