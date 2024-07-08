import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.Border;
class Lspart2 extends JFrame {

JLabel l1,l2,l3,l4;
JTextField t1,t2;
JTextArea p1;
JButton b1,b2;
JButton b3;
    
    Lspart2(String s1) {
        super(s1);
    }

    void setComponents() {
		
		Cursor c1=new Cursor(Cursor.HAND_CURSOR);
		Cursor c2=new Cursor(Cursor.HAND_CURSOR);
		Cursor c3=new Cursor(Cursor.HAND_CURSOR);
		 
		 Font f1=new Font("Calibri",Font.BOLD,28);
		  Font f2=new Font("Calibri",Font.BOLD,20);
		  Font f3=new Font("Calibri",Font.BOLD,20);
		  Font f4=new Font("Calibri",Font.BOLD,24);
		
     l1 =new JLabel("Welcome to coding seekho Institute");
	 l1.setFont(f1);
	 l1.setForeground(Color.green);
	 l2 =new JLabel("User Name");
	 l2.setFont(f2);
	 l3 =new JLabel("Password");
	 l3.setFont(f3);
	 l4 =new JLabel();
	 l4.setFont(f4);
	 l4.setForeground(Color.blue);
	 t1 =new JTextField();
	 Border g1 = BorderFactory.createLineBorder(Color.BLUE);
       t1.setBorder(g1);
	 t2 =new JTextField();
      Border g3 = BorderFactory.createLineBorder(Color.BLUE);
       t2.setBorder(g3);
	 p1 =new JTextArea();
	  Border g2 = BorderFactory.createLineBorder(Color.RED);
       p1.setBorder(g2);
	 b1 =new JButton("Login");
      b1.setCursor(c1);
	  b1.setForeground(Color.white);
	  b1.setBackground(Color.black);
	 b2 =new JButton("clear");
	  b2.setCursor(c2);
	   b2.setForeground(Color.white);
	  b2.setBackground(Color.black);
	 b3 =new JButton("Add");
	  b3.setCursor(c3);
	   b3.setForeground(Color.white);
	  b3.setBackground(Color.black);
	  
	 setLayout(null);
	 add(l1);
	 add(l2);
	 add(l3);
	 add(l4);
	 add(t1);
	 add(t2);
	 add(p1);
	 add(b1);
	 add(b2);
	 add(b3);
	 l1.setBounds(150,30,500,40);
	 l2.setBounds(230,100,150,30);
     l3.setBounds(230,200,150,30);
	 l4.setBounds(100,550,249,30);
	 t1.setBounds(350,100,100,30);
	t2.setBounds(350,200,100,30);
    p1.setBounds(250,270,300,120);
	 b1.setBounds(400,440,130,40);
     b2.setBounds(400,500,130,40);
	   b3.setBounds(400,550,130,40);
     b1.addActionListener(new Log());
     b2.addActionListener(new Clear());	 
     b3.addActionListener(new Add());
    }

    public static void main(String args[]) {
        Lspart2 s1 = new Lspart2("coding seekho");
        s1.setSize(700, 700);
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s1.setComponents();
        s1.setVisible(true);
    }
	
	class Log implements ActionListener
	{
		public void actionPerformed(ActionEvent e2)
		{
			String s1=t1.getText();
			String s2=t2.getText();
			if(s1.equals("coding") && s2.equals("12345"))
			{
				l4.setText("login sucessful");
			}
			else
			{
				l4.setText("login unsucessful");
			}
		}
		
	}
	
	class Clear implements ActionListener
	{
		public void actionPerformed(ActionEvent e2)
		{
			t1.setText("");
			t2.setText("");
		}
		
	}
	
	class Add implements ActionListener
	{
		public void actionPerformed(ActionEvent e3)
		{
			try{
				int a=Integer.parseInt(t1.getText());
		  int b=Integer.parseInt(t2.getText());
				int c=a+b;
		        l4.setText("Addition is "+c);
			}
		  catch(Exception e5)
		  {
			  l4.setText("please enter  number only");
		  }
		
		}
		
	}
}

