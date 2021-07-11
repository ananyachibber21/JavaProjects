import java.awt.*;  
import javax.swing.JFrame;  
  
public class FourthGUI extends Canvas{  
      
    public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("C:\\Users\\HP\\Pictures\\Camera Roll\\IMG_20200712_182922.jpg");  
        g.drawImage(i, 120,100,this);  
          
    }  
        public static void main(String[] args) {  
        SecondGUI m=new SecondGUI();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        f.setVisible(true);  
    }  
  
} 

