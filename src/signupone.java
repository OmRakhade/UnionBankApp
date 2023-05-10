import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.util.Random;

public class signupone extends JFrame implements ActionListener {

    JLabel fromno, personaldetails, name, fname, dob, gender, email, marital, address, city, state, pinc;
    JTextField nametf, fnametf, citytf, statetf, pinctf, addresstf, emailtf, gendertf;
    JDateChooser dateChooser;
    JRadioButton male ,female,others,married,unmarried,other;
    ButtonGroup maritalgroup,gendergroup;
    Random ran = new Random();
    long random = Math.abs((ran.nextLong()% 9000L)+ 1000L);
   public signupone() {
        setSize(800, 700);
        setLocation(250, 0);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel image = new JLabel(new ImageIcon("D:\\Java\\download0.png"));
        image.setBounds(20, -40, 200, 200);
        add(image);
        
       
        
        fromno = new JLabel("APPLICATION FORM NO. "+random);
        fromno.setBounds(230, 20, 500, 40);
        fromno.setFont(new Font("Raleway", Font.BOLD, 30));
        add(fromno);

        personaldetails = new JLabel("Page 1 : Personal Details ");
        personaldetails.setBounds(300, 60, 500, 40);
        personaldetails.setFont(new Font("Raleway", Font.BOLD, 15));
        add(personaldetails);

        name = new JLabel("Name:");
        name.setBounds(40, 130, 500, 40);
        name.setFont(new Font("Raleway", Font.BOLD, 18));
        add(name);

        nametf = new JTextField();
        nametf.setBounds(210, 130, 500, 30);
        nametf.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
        add(nametf);

        fname = new JLabel("Father's Name:");
        fname.setBounds(40, 180, 500, 40);
        fname.setFont(new Font("Raleway", Font.BOLD, 18));
        add(fname);

        fnametf = new JTextField();
        fnametf.setBounds(210, 180, 500, 30);
        fnametf.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
        add(fnametf);

        dob = new JLabel("Date Of Birth:");
        dob.setBounds(40, 230, 500, 40);
        dob.setFont(new Font("Raleway", Font.BOLD, 18));
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(210, 230, 500, 30);
        dateChooser.setFont(new Font(Font.DIALOG, Font.BOLD, 15));
        add(dateChooser);

        gender = new JLabel("Gender:");
        gender.setBounds(40, 280, 500, 40);
        gender.setFont(new Font("Raleway", Font.BOLD, 18));
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(210, 280, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);

         female = new JRadioButton("Female");
        female.setBounds(280, 280, 80, 30);
        female.setBackground(Color.WHITE);
        add(female);

       others = new JRadioButton("Other");
        others.setBounds(370, 280, 80, 30);
        others.setBackground(Color.WHITE);
        add(others);

         gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(others);

        email = new JLabel("Email Address:");
        email.setBounds(40, 330, 500, 40);
        email.setFont(new Font("Raleway", Font.BOLD, 18));
        add(email);

        emailtf = new JTextField();
        emailtf.setBounds(210, 330, 500, 30);
        emailtf.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
        add(emailtf);

        marital = new JLabel("Marital Status:");
        marital.setBounds(40, 380, 500, 40);
        marital.setFont(new Font("Raleway", Font.BOLD, 18));
        add(marital);

         married = new JRadioButton("Married");
        married.setBounds(210, 380, 80, 30);
        married.setBackground(Color.WHITE);
        add(married);

         unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(300, 380, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

         other = new JRadioButton("Other");
        other.setBounds(400, 380, 80, 30);
        other.setBackground(Color.WHITE);
        add(other);

        maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);

        address = new JLabel("Address:");
        address.setBounds(40, 430, 500, 40);
        address.setFont(new Font("Raleway", Font.BOLD, 18));
        add(address);

        addresstf = new JTextField();
        addresstf.setBounds(210, 430, 500, 30);
        addresstf.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
        add(addresstf);

        city = new JLabel("City:");
        city.setBounds(40, 480, 500, 40);
        city.setFont(new Font("Raleway", Font.BOLD, 18));
        add(city);

        citytf = new JTextField();
        citytf.setBounds(210, 480, 500, 30);
        citytf.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
        add(citytf);

        state = new JLabel("State:");
        state.setBounds(40, 530, 500, 40);
        state.setFont(new Font("Raleway", Font.BOLD, 18));
        add(state);

        statetf = new JTextField();
        statetf.setBounds(210, 530, 500, 30);
        statetf.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
        add(statetf);

        pinc = new JLabel("Pin Code:");
        pinc.setBounds(40, 580, 500, 40);
        pinc.setFont(new Font("Raleway", Font.BOLD, 18));
        add(pinc);

        pinctf = new JTextField();
        pinctf.setBounds(210, 580, 500, 30);
        pinctf.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
        add(pinctf);

        JButton next = new JButton("NEXT");
        next.setBackground(Color.RED);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 620, 80, 30);
        next.addActionListener(this);
        add(next);
    }

    public void actionPerformed(ActionEvent a) {
    String fromno = " "+random;
    String name=nametf.getText();
    String fathername=fnametf.getText();
    String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
    String gender = null;
    if(male.isSelected())
    {
        gender="male";
    }else if(female.isSelected())
    {
        gender="female";

    }else if(others.isSelected()){
        gender="other";
    }
    String email=emailtf.getText();
    String marital = null;
    if(married.isSelected())
    {
        marital="married";
    }else if(unmarried.isSelected())
    {
        marital="unmarried";

    }else if(other.isSelected()){
        marital="other";
    }
    String address=addresstf.getText();
    String city=citytf.getText();
    String pincode=pinctf.getText();
    String state=statetf.getText();
   
    // validation

    try {
        if(name.equals("")){
            JOptionPane.showMessageDialog(null,"Name is required.");
        }
        if(fathername.equals("")){
            JOptionPane.showMessageDialog(null,"Father name is required.");
        }
        if(dob.equals("")){
            JOptionPane.showMessageDialog(null,"Date Of Birth is required.");
        }
        if(gender.equals("")){
            JOptionPane.showMessageDialog(null,"Gender is required.");
        }
        if(email.equals("")){
            JOptionPane.showMessageDialog(null,"Emial is required.");
        }
        if(marital.equals("")){
            JOptionPane.showMessageDialog(null,"Material Status is required.");
        }
        if(address.equals("")){
            JOptionPane.showMessageDialog(null,"Address is required.");
        }
        if(city.equals("")){
            JOptionPane.showMessageDialog(null,"City is required.");
        }
        if(pincode.equals("")){
            JOptionPane.showMessageDialog(null,"Pin Code is required.");
        }
        if(state.equals("")){
            JOptionPane.showMessageDialog(null,"state is required.");
        }else
        {
            connection c = new connection();
            String query = "INSERT INTO signup VALUES ('"+fromno+"','"+name+"','"+fathername+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
            c.s.executeUpdate(query);

            setVisible(false);
            new signuptwo(fromno).setVisible(true);
        }
    } catch (Exception e) {
        System.out.println(e);
    }
    }

    public static void main(String[] args) {
        new signupone().setVisible(true);
    }
}
