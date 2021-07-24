package quiztest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener{
	
	JButton b1,b2,b3;
	JLabel qNo, ques;
	JRadioButton op1,op2,op3,op4;
	ButtonGroup bg;
	String q[][] = new String[10][5];
	String a[][] = new String[10][1];
	String correct[][] = new String[10][2];
	public static int count = 0;
	public static int timer = 15;
	public static int ans_given = 0;
	public static int score =0;
	
	String username;
	Quiz(String username){
		this.username = username;
		setVisible(true);
		getContentPane().setBackground(Color.CYAN); 
		setSize(1000,600); 
		setLayout(null);
		
		qNo = new JLabel("");
		qNo.setFont(new Font("Raleway", Font.PLAIN, 20));
		qNo.setForeground(Color.RED);
		qNo.setBounds(50,50,200,30);
		add(qNo);
		
		ques = new JLabel("");
		ques.setFont(new Font("Raleway", Font.PLAIN, 20));
		ques.setForeground(Color.RED);
		ques.setBounds(80,50,900,30);
		add(ques);
		
		q[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        q[0][1] = "JVM";
        q[0][2] = "JDB";
        q[0][3] = "JDK";
        q[0][4] = "JRE";

        q[1][0] = "What is the return type of the hashCode() method in the Object class?";
        q[1][1] = "int";
        q[1][2] = "Object";
        q[1][3] = "long";
        q[1][4] = "void";

        q[2][0] = "Which package contains the Random class?";
        q[2][1] = "java.util package";
        q[2][2] = "java.lang package";
        q[2][3] = "java.awt package";
        q[2][4] = "java.io package";

        q[3][0] = "An interface with no fields or methods is known as?";
        q[3][1] = "Runnable Interface";
        q[3][2] = "Abstract Interface";
        q[3][3] = "Marker Interface";
        q[3][4] = "CharSequence Interface";

        q[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        q[4][1] = "Stack";
        q[4][2] = "String memory";
        q[4][3] = "Random storage space";
        q[4][4] = "Heap memory";

        q[5][0] = "Which of the following is a marker interface?";
        q[5][1] = "Runnable interface";
        q[5][2] = "Remote interface";
        q[5][3] = "Readable interface";
        q[5][4] = "Result interface";

        q[6][0] = "Which keyword is used for accessing the features of a package?";
        q[6][1] = "import";
        q[6][2] = "package";
        q[6][3] = "extends";
        q[6][4] = "export";

        q[7][0] = "In java, jar stands for?";
        q[7][1] = "Java Archive Runner";
        q[7][2] = "Java Archive";
        q[7][3] = "Java Application Resource";
        q[7][4] = "Java Application Runner";

        q[8][0] = "Which of the following is a mutable class in java?";
        q[8][1] = "java.lang.StringBuilder";
        q[8][2] = "java.lang.Short";
        q[8][3] = "java.lang.Byte";
        q[8][4] = "java.lang.String";

        q[9][0] = "Which of the following option leads to the portability and security of Java?";
        q[9][1] = "Bytecode is executed by JVM";
        q[9][2] = "The applet makes the Java code secure and portable";
        q[9][3] = "Use of exception handling";
        q[9][4] = "Dynamic binding between objects";
        
        correct[0][1] = "JDB";
        correct[1][1] = "int";
        correct[2][1] = "java.util package";
        correct[3][1] = "Marker Interface";
        correct[4][1] = "Heap memory";
        correct[5][1] = "Remote interface";
        correct[6][1] = "import";
        correct[7][1] = "Java Archive";
        correct[8][1] = "java.lang.StringBuilder";
        correct[9][1] = "Bytecode is executed by JVM";
		
		op1 = new JRadioButton("");
		op1.setFont(new Font("Raleway", Font.PLAIN, 20));
		op1.setForeground(Color.RED);
		op1.setBounds(80,150,400,30);
		add(op1);
		
		op2 = new JRadioButton("");
		op2.setFont(new Font("Raleway", Font.PLAIN, 20));
		op2.setForeground(Color.RED);
		op2.setBounds(80,200,400,30);
		add(op2);
		
		op3 = new JRadioButton();
		op3.setFont(new Font("Raleway", Font.PLAIN, 20));
		op3.setForeground(Color.RED);
		op3.setBounds(80,250,400,30);
		add(op3);
		
		op4 = new JRadioButton();
		op4.setFont(new Font("Raleway", Font.PLAIN, 20));
		op4.setForeground(Color.RED);
		op4.setBounds(80,300,400,30);
		add(op4);
		
		bg = new ButtonGroup();
		bg.add(op1);
		bg.add(op2);
		bg.add(op3);
		bg.add(op4);
		
		b1 = new JButton("Next");
		b1.setFont(new Font("Raleway", Font.BOLD, 20));
		b1.setBackground(Color.CYAN);
		b1.setForeground(Color.RED);
		b1.setBounds(50, 400, 100, 40);
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("50/50 Lifeline");
		b2.setFont(new Font("Raleway", Font.BOLD, 20));
		b2.setBackground(Color.CYAN);
		b2.setForeground(Color.RED);
		b2.setBounds(180, 400, 200, 40);
		b2.addActionListener(this);
		add(b2);
		
		b3 = new JButton("Submit");
		b3.setFont(new Font("Raleway", Font.BOLD, 20));
		b3.setBackground(Color.CYAN);
		b3.setForeground(Color.RED);
		b3.setEnabled(false);
		b3.setBounds(410, 400, 100, 40);
		b3.addActionListener(this);
		add(b3);
		
		start(0);
		
	}
	
	public void start(int count) {
		qNo.setText("" + (count +1) + ". "); //setText is used for strings. We can apply empty string "" to convert it into int
	    ques.setText(q[count][0]);
	    op1.setLabel(q[count][1]);
	    op1.setActionCommand(q[count][1]); //choose the value that will be selected
	    op2.setLabel(q[count][2]);
	    op2.setActionCommand(q[count][2]);
	    op3.setLabel(q[count][3]);
	    op3.setActionCommand(q[count][3]);
	    op4.setLabel(q[count][4]);
	    op4.setActionCommand(q[count][4]);
	    bg.clearSelection();
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b1) {
			repaint(); //In-built function
			
			op1.setEnabled(true);
			op2.setEnabled(true);
			op3.setEnabled(true);
			op4.setEnabled(true);
			
			ans_given = 1;
			if(bg.getSelection()==null) 
				//to check if no option is left unselected 
			{
				a[count][0] = "";
			}
			else {
				a[count][0] = bg.getSelection().getActionCommand(); // this gets the selected option from all
			}
			
			if(count ==8) {
				b1.setEnabled(false);
				b3.setEnabled(true);
			}
			
			count++;
			start(count);
		}
		else if(ae.getSource() == b2){
			if(count ==2 || count ==4 || count == 6 || count==8) {
				op2.setEnabled(false);
				op3.setEnabled(false);
			}
			else {
				op1.setEnabled(false);
				op4.setEnabled(false);
			}
			b2.setEnabled(false);
		}
		else {
			ans_given = 1;
			if(bg.getSelection()==null) 
				 
			{
				a[count][0] = "";
			}
			else {
				a[count][0] = bg.getSelection().getActionCommand(); 
			}
			
			for(int i=0; i<a.length; i++) {
				if(a[i][0].equals(correct[i][1])) {
					score+=10;
				}
				else {
					score+=0;
				}
				this.setVisible(false);
				//and open a new frame of score
				
				new Score(username, score).setVisible(true);
			}			
		}
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		String time ="Time Left - "+ timer; //15
		g.setColor(Color.RED);
		g.setFont(new Font("Raleway", Font.BOLD, 18));		
		
		if(timer>0) {
			g.drawString(time, 430, 60);
		}
		else {
			g.drawString("Times Up!!!", 430, 60);
		}
		
		timer--; //14
		
		try {
			Thread.sleep(1000); //Manage the countdown using multithreading
			repaint(); //calling the function multiple times
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		if(ans_given ==1) {
			ans_given = 0;
			timer = 15;
		}
		
		if(timer<0) {
			timer =15;
			op1.setEnabled(true);
            op2.setEnabled(true);
            op3.setEnabled(true);
            op4.setEnabled(true);
			
			if(count ==8) {
				b1.setEnabled(false);
				b3.setEnabled(true);
			}
			
			if(count == 9) {
				if(bg.getSelection()==null) 
					 
				{
					a[count][0] = "";
				}
				else {
					a[count][0] = bg.getSelection().getActionCommand(); 
				}
				
				for(int i=0; i<a.length; i++) {
					if(a[i][0].equals(correct[i][1])) {
						score+=10;
					}
					else {
						score+=0;
					}
					this.setVisible(false);
					//and open a new frame of score
					
					new Score(username, score).setVisible(true);
				}
			}
			else {
				if(bg.getSelection()==null) 
					 
				{
					a[count][0] = "";
				}
				else {
					a[count][0] = bg.getSelection().getActionCommand(); 
				}
				count++;
				start(count);
			}
		}
		
	} //calling in-built function repaint
	
		
	public static void main(String[] args) {
		new Quiz("");

	}

}
