package quiztest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
	
	Score(String username, int score){
		setVisible(true);
		getContentPane().setBackground(Color.CYAN); 
		setSize(600,600); 
		setLayout(null);
		
		JLabel l1 = new JLabel("Thank you " + username + " for Playing!");
		l1.setFont(new Font("Raleway", Font.BOLD, 32));
		l1.setForeground(Color.RED);
		l1.setBounds(10, 10, 500, 100);
		add(l1);
		
		JLabel l2 = new JLabel("Your score is..."+ score);
		l2.setFont(new Font("Raleway", Font.BOLD, 28));
		l2.setForeground(Color.RED);
		l2.setBounds(160, 180, 500, 100);
		add(l2);
		
		JButton b1 = new JButton("Play Again");
		b1.setFont(new Font("Raleway", Font.BOLD, 20));
		b1.setBackground(Color.CYAN);
		b1.setForeground(Color.RED);
		b1.setBounds(180, 300, 150, 40);
		b1.addActionListener(this);
		add(b1);
	}
	
	public void actionPerformed(ActionEvent ae) {
		this.setVisible(false);
		new QuizTest().setVisible(true);
	}

	public static void main(String[] args) {
		new Score("", 0);
	}

}
