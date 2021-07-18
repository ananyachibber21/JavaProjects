import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class FifthGUI
{
	public static void main(String[] args)
	{
		JFrame f = new JFrame("Menu Demo");
		f.setLayout(new FlowLayout());
		JMenuItem m1 = new JMenuItem("New");
		JMenuItem m2 = new JMenuItem("Open");
		JMenuItem m3 = new JMenuItem("Save");
		JMenu file = new JMenu("File");
		file.add(m1);
		file.add(m2);
		file.add(m3);
		JMenuBar br = new JMenuBar();
		br.add(file);
		f.add(br);
		f.setVisible(true);
		f.setSize(400,400);
	}
}

