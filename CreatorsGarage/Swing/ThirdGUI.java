import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;

public class ThirdGUI {

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
		
		JButton b = new JButton("Click");
		b.setBounds(100,150,120,40);
		add(b);
		
		JRadioButton r1 = new JRadioButton();
		JRadioButton r2 = new JRadioButton();
		r1.setBounds(100,150,120,40);
		r2.setBounds(100,150,120,40);
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		add(r1);
		add(r2);
		
		JTextArea t = new JTextArea(10,10);
		t.setBounds(100,150,120,40);
		add(t);
	}
}
