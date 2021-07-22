package quiztest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class QuizTest extends JFrame implements ActionListener{
	
	JButton b1, b2; // Declaring b1, b2 globally so that it can be used inside abstract class
	JTextField t1; 
	QuizTest(){
		setVisible(true);
		getContentPane().setBackground(Color.CYAN); //getContentPane() is used when you have to make a change to the entire frame. Here we set background color to the entire frame.
		setSize(600,600); 
		setLayout(null);
		//ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("C:\\Users\\HP\\Documents\\Java\\QuizGame\\src\\quiztest\\icons"));
		//JLabel l1 = new JLabel(i1); 
		//l1.setBounds(10, 10, 600, 500); 
		//add(l1); 
		
		JLabel l1 = new JLabel("Java Quiz");
		l1.setFont(new Font("Raleway", Font.BOLD, 60));
		l1.setForeground(Color.RED);
		l1.setBounds(150, 10, 500, 100);
		add(l1);
		
		JLabel l2 = new JLabel("Enter Your Name");
		l2.setFont(new Font("Raleway", Font.BOLD, 28));
		l2.setForeground(Color.RED);
		l2.setBounds(170, 200, 500, 100);
		add(l2);
		
		t1 = new JTextField();
		t1.setFont(new Font("Raleway", Font.BOLD, 20));
		t1.setBackground(Color.CYAN);
		t1.setForeground(Color.RED);
		t1.setBounds(100, 300, 380, 30);
		add(t1);
		
		b1 = new JButton("Rules");
		b1.setFont(new Font("Raleway", Font.BOLD, 20));
		b1.setBackground(Color.CYAN);
		b1.setForeground(Color.RED);
		b1.setBounds(120, 400, 150, 40);
		b1.addActionListener(this); //Applying event to tell that a function is to be performed when button b1 is clicked
		add(b1);
		
		b2 = new JButton("Exit");
		b2.setFont(new Font("Raleway", Font.BOLD, 20));
		b2.setBackground(Color.CYAN);
		b2.setForeground(Color.RED);
		b2.setBounds(300, 400, 150, 40);
		b2.addActionListener(this);
		add(b2);
		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b1) {
			String name = t1.getText(); //getText() is used to get any value that is inside t1
		    this.setVisible(false); //This will close the previous frame while opening a new frame
			new Rules(name); //Exporting the value into username in class Rules
		}
		else {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new QuizTest();
	}
}
