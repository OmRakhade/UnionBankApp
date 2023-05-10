import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class index extends JFrame implements ActionListener{
    JFrame f;
    JButton submit,back,signup;
    CardLayout card;
    Container c;   
    JTextField t1;
    JPasswordField t2;   


index(){  
getContentPane().setBackground(Color.WHITE);


JLabel image = new JLabel( new ImageIcon("D:\\Java\\union-logo.png"));
image.setBounds(40, -80, 1200, 300);
add(image);
JLabel image1 = new JLabel( new ImageIcon("D:\\Java\\Mobile-login3.png"));
image1.setBounds(150, 250, 350, 350);
add(image1);

JLabel heading = new JLabel("Enter Your Details");
heading.setBounds(700,200, 400,50);
heading.setFont(new Font(Font.DIALOG,Font.BOLD,40));
add(heading);

JLabel name=new JLabel("Account no :");
name.setBounds(670,300, 250,30);
name.setFont(new Font(Font.DIALOG,Font.BOLD,20));
add(name);


t1=new JTextField("");
t1.setFont(new Font("Arial", Font.BOLD, 14));  
t1.setBounds(800,300, 200,30); 

JLabel name1=new JLabel("PIN               :");
name1.setBounds(670,350, 300,30);
name1.setFont(new Font(Font.DIALOG,Font.BOLD,20));
add(name1);


t2=new JPasswordField(""); 
t2.setFont(new Font("Arial", Font.BOLD, 14));   
t2.setBounds(800,350, 200,30);  
add(t1);add(t2); 


submit=new JButton("SUBMIT");
submit.setBounds(700,430, 150,30);
submit.setBackground(Color.RED);
submit.setForeground(Color.WHITE);
submit.addActionListener(this);
add(submit);

back=new JButton("BACK");
back.setBounds(900,430, 150,30);
back.setBackground(Color.RED);
back.setForeground(Color.WHITE);
back.addActionListener(this);
add(back);

signup=new JButton("SIGN UP");
signup.setBounds(700,480, 350,30);
signup.setBackground(Color.RED);
signup.setForeground(Color.WHITE);
signup.addActionListener(this);
add(signup);

getContentPane().setBackground(Color.WHITE);
        
setSize(1200,700);
setLocation(30,0);

setLayout(null);

}

public void actionPerformed(ActionEvent a){
 
  if(a.getSource()==submit)
  {
   
    connection c = new connection();
    String card_no = t1.getText();
    String pin=t2.getText();
    String query = "select * from user where card_no = '"+card_no+"' and pin = '"+pin+"'";

    try {
       ResultSet rs =c.s.executeQuery(query);
       System.out.println("query executed successfully");
       System.out.println(rs);
       if(rs.next())
       {
        setVisible(false);
        new  home(card_no).setVisible(true);
        System.out.println("matched");
       }else{
        JOptionPane.showMessageDialog(null, "Incorrect Account Number or Pin");
       }
    } catch (Exception e) {
      System.out.println(e);
    }
   
    
  }else if(a.getSource()==back)
  {
    setVisible(false);
  }else if(a.getSource() == signup)
  {
    setVisible(false);
    new  signupone().setVisible(true);
  }
}
    public static void main(String[] args) {
        new index().setVisible(true);
    }
}
