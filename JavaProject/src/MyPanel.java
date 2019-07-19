
import javax.swing.JButton;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	private static final long serialVersionUID = 1L;

public MyPanel(){
    JPanel pan = new JPanel();
    JButton okButton = new JButton("OK");
    pan.add(okButton);
}
}