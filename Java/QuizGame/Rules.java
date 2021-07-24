package quiztest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
	
	JButton b1, b2;
	String username; // storing it globally to be able to call it in next class
	Rules(String username){
		this.username = username; //calling username inside the block of code using "this" keyword
		setVisible(true);
		getContentPane().setBackground(Color.CYAN); 
		setSize(600,600); 
		setLayout(null);
		
		JLabel l1 = new JLabel("Welcome "+username+" to Java Quiz");
		l1.setFont(new Font("Raleway", Font.BOLD, 32));
		l1.setForeground(Color.RED);
		l1.setBounds(60, 10, 500, 100);
		add(l1);
		
		JLabel l2 = new JLabel("");
		l2.setFont(new Font("Raleway", Font.PLAIN, 20));
		l2.setForeground(Color.RED);
		l2.setBounds(40, 80, 500, 300);
		l2.setText("<html>"+
		
				"1. There are total 10 questions."+"<br><br>"+
				"2. You will be given 15 seconds to attempt each question"+"<br><br>"+
				"3. You have to choose 1 out of 4 options."+"<br><br>"+
				"4. Read the questions carefully before attempting."+"<br><br>"+
				"5. All questions are compulsary."+"<br><br>"+
				"</html>"
				
				);
		add(l2);
		
		b1 = new JButton("Back");
		b1.setFont(new Font("Raleway", Font.BOLD, 20));
		b1.setBackground(Color.CYAN);
		b1.setForeground(Color.RED);
		b1.setBounds(100, 400, 150, 40);
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("Start");
		b2.setFont(new Font("Raleway", Font.BOLD, 20));
		b2.setBackground(Color.CYAN);
		b2.setForeground(Color.RED);
		b2.setBounds(280, 400, 150, 40);
		b2.addActionListener(this);
		add(b2);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b1) {
			this.setVisible(false);
			new QuizTest().setVisible(true);
		}
		else{
			this.setVisible(false);
			new Quiz(username).setVisible(true);
		}
	}

	public static void main(String[] args) {
		new Rules("");

	}

}
