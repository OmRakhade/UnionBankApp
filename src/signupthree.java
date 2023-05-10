import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class signupthree extends JFrame implements ActionListener {

    JLabel fromnumber, heading, ac_type, ac_number, pin, heading1, heading3,cvv;
    JTextField ac_numbertf, pintf,cvvtf;
    String formnum;
    JRadioButton saveac, fixac, currentac, reccuringac;
    ButtonGroup ac_typegp;
    JButton submit, cancle;
    Random ran = new Random();
    long random = Math.abs((ran.nextLong()% 9000L)+ 1000L);

    public signupthree(String fromno) {
        this.formnum = fromno;
        setSize(800, 700);
        setLocation(250, 0);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel image = new JLabel(new ImageIcon("D:\\Java\\download0.png"));
        image.setBounds(20, -40, 200, 200);
        add(image);

        heading = new JLabel("Page 3: Account Details");
        heading.setBounds(230, 30, 500, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 30));
        add(heading);

        fromnumber = new JLabel("From no : " + formnum);
        fromnumber.setBounds(620, 0, 200, 40);
        fromnumber.setFont(new Font("Raleway", Font.BOLD, 15));
        add(fromnumber);

        ac_type = new JLabel("Account Type :");
        ac_type.setBounds(50, 130, 500, 40);
        ac_type.setFont(new Font("Raleway", Font.BOLD, 18));
        add(ac_type);

        saveac = new JRadioButton("Saving Account");
        saveac.setBounds(200, 180, 200, 30);
        saveac.setBackground(Color.WHITE);
        add(saveac);

        fixac = new JRadioButton("Fixed Deposite Account");
        fixac.setBounds(350, 180, 250, 30);
        fixac.setBackground(Color.WHITE);
        add(fixac);

        currentac = new JRadioButton("Current Account");
        currentac.setBounds(200, 220, 150, 30);
        currentac.setBackground(Color.WHITE);
        add(currentac);

        reccuringac = new JRadioButton("Recrring Deposite Account");
        reccuringac.setBounds(350, 220, 250, 30);
        reccuringac.setBackground(Color.WHITE);
        add(reccuringac);

        ac_typegp = new ButtonGroup();
        ac_typegp.add(saveac);
        ac_typegp.add(fixac);
        ac_typegp.add(currentac);
        ac_typegp.add(reccuringac);

        ac_number = new JLabel("Account Number :");
        ac_number.setBounds(50, 300, 500, 40);
        ac_number.setFont(new Font("Raleway", Font.BOLD, 18));
        add(ac_number);

        ac_numbertf = new JTextField();
        ac_numbertf.setBounds(220, 310, 500, 30);
        ac_numbertf.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
        add(ac_numbertf);

        pin = new JLabel("PIN                       :");
        pin.setBounds(50, 370, 500, 40);
        pin.setFont(new Font("Raleway", Font.BOLD, 18));
        add(pin);

        pintf = new JTextField();
        pintf.setBounds(220, 380, 500, 30);
        pintf.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
        add(pintf);

        heading1 = new JLabel("(4 - Digit Password)");
        heading1.setBounds(50, 400, 300, 30);
        heading1.setFont(new Font(Font.DIALOG, Font.BOLD, 12));
        add(heading1);

        cvv = new JLabel("CVV                      :");
        cvv.setBounds(50, 440, 500, 40);
        cvv.setFont(new Font("Raleway", Font.BOLD, 18));
        add(cvv);

        cvvtf = new JTextField();
        cvvtf.setBounds(220, 450, 500, 30);
        cvvtf.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
        add(cvvtf);

        submit = new JButton("SUBMIT");
        submit.setBounds(300, 580, 90, 30);
        submit.setBackground(Color.RED);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        
        add(submit);

        cancle = new JButton("CANCLE");
        cancle.setBounds(450, 580, 90, 30);
        cancle.setBackground(Color.RED);
        cancle.setForeground(Color.WHITE);
        cancle.addActionListener(this);
        
        add(cancle);
    }

    public void actionPerformed(ActionEvent a) {
        String formno = formnum;
        String account_type = null;
        if(saveac.isSelected())
        {
            account_type="Saving Account";
        }else if(fixac.isSelected())
        {
            account_type="Fixed Deposite Account";

        }else if(currentac.isSelected()){
            account_type = "Current Account";
        }else{
            account_type="Recuring Deposite Account";
        }

        String ac_no = ac_numbertf.getText();
        String pin = pintf.getText();
        String cvv = cvvtf.getText();

        if(a.getSource()==submit)
        {

            setVisible(false);

            new home(ac_no).setVisible(true);
            try {
                connection c = new connection();
                String query = "INSERT INTO signupthree VALUES ('" + formno + "','" + account_type + "','" + ac_no + "','" + pin + "','" + cvv+ "')";
                c.s.executeUpdate(query);
                String query1 = "INSERT INTO user VALUES ('"+ ac_no+"','"+pin+"','"+random+"')";
                c.s.executeUpdate(query1);
                JOptionPane.showMessageDialog(null, "You Sign Up Successfully");
                
    
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        if(a.getSource()==cancle){
            setVisible(false);
            new index().setVisible(true);
        }
       

    }

    public static void main(String args[]) {
        new signupthree("").setVisible(true);
    }
}
