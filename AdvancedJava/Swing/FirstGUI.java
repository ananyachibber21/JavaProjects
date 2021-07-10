import javax.swing.JFrame;
import javax.swing.JLabel;
public class FirstGUI {

	public static void main(String[] args) {
		
		Jframes ob = new Jframes();
		ob.setVisible(true);
		ob.setSize(500,500);

	}
}

class Jframes extends JFrame
{
	Jframes(){
		JLabel l = new JLabel("Hello World");
		add(l);
	}
}
