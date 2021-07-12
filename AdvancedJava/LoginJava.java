import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LoginJava
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Login Form");
        f.setLayout(null);
        JLabel label = new JLabel();
        label.setBounds(30,200, 200,50);
        JLabel l1 = new JLabel("Username: ");
        l1.setBounds(20,20, 80,30);
        JLabel l2=new JLabel("Password:");
        l2.setBounds(20,70, 80,30);
        JTextField text = new JTextField();
        text.setBounds(100,20, 100,30);
        JPasswordField pass = new JPasswordField();
        pass.setBounds(100,75,100,30);
        JButton btn = new JButton("LOGIN");
        btn.setBounds(150,150,100,30);
        f.add(label);
        f.add(l1);
        f.add(l2);
        f.add(text);
        f.add(pass);
        f.add(btn);
        f.setVisible(true);
        f.setSize(400,400);
        btn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String data = "Username: " + text.getText();
                data = data + ", Password: " + new String(pass.getPassword());
                label.setText(data);
            }
        });        
    }
}