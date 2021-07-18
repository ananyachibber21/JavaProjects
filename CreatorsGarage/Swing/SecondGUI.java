import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SecondGUI {

	public static void main(String[] args) {
		
		Jframes ob = new Jframes();
		ob.setVisible(true);
		ob.setSize(500,500);

	}
}

class Jframes extends JFrame
{
	Jframes(){
		setLayout(new FlowLayout());
		JLabel l = new JLabel("Hello World");
		JLabel l1 = new JLabel("This is Ananya");
		add(l);
		add(l1);
		}
}
