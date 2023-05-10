import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;


public class signuptwo extends JFrame implements ActionListener {

    JLabel heading,fromnumber, religion, category, income, eduquli, occupation, pan, aadhar, senior, exitac;
    JTextField aadhartf, pantf;
    JComboBox<String> religonBox, categoryBox, incomeBox, eductionalBox, occuptionBox;
    String religionval[] = { "Hindu", "Muslim", "Sikh", "Christion", "Others" };
    String categoryval[] = { "Genral", "OBC", "SC", "ST", "Other" };
    String incomeval[] = { "Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "upto 10,00,000" };
    String eductionalval[] = { "Non-graduate", "Pre-graduate", "Post-graduate", "Others" };
    String occupationval[] = { "Salaried", "Self-employeed", "Bussiness", "Student", "Retired", "Others" };
    String formnum;
    JRadioButton yess, nos, others, yesac, noac;
    ButtonGroup seniorGroup, acountGroup;

    public signuptwo(String fromno) {
        this.formnum = fromno;
        setSize(800, 700);
        setLocation(250, 0);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel image = new JLabel(new ImageIcon("D:\\Java\\download0.png"));
        image.setBounds(20, -40, 200, 200);
        add(image);

        heading = new JLabel("Page 2: Additional Details");
        heading.setBounds(230, 30, 500, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 30));
        add(heading);
        
        fromnumber = new JLabel("From no : "+ formnum);
        fromnumber.setBounds(620, 0, 200, 40);
        fromnumber.setFont(new Font("Raleway", Font.BOLD, 15));
        add(fromnumber);
        
        religion = new JLabel("Religion:");
        religion.setBounds(40, 130, 500, 40);
        religion.setFont(new Font("Raleway", Font.BOLD, 18));
        add(religion);

        religonBox = new JComboBox<String>(religionval);
        religonBox.setBounds(210, 130, 500, 30);
        religonBox.setFont(new Font(Font.DIALOG, Font.BOLD, 16));
        religonBox.setBackground(Color.WHITE);
        add(religonBox);

        category = new JLabel("Category:");
        category.setBounds(40, 180, 500, 40);
        category.setFont(new Font("Raleway", Font.BOLD, 18));
        add(category);

        categoryBox = new JComboBox<String>(categoryval);
        categoryBox.setBackground(Color.WHITE);
        categoryBox.setBounds(210, 180, 500, 30);
        categoryBox.setFont(new Font(Font.DIALOG, Font.BOLD, 16));
        add(categoryBox);

        income = new JLabel("Income:");
        income.setBounds(40, 230, 500, 40);
        income.setFont(new Font("Raleway", Font.BOLD, 18));
        add(income);

        incomeBox = new JComboBox<String>(incomeval);
        incomeBox.setBackground(Color.WHITE);
        incomeBox.setBounds(210, 230, 500, 30);
        incomeBox.setFont(new Font(Font.DIALOG, Font.BOLD, 16));
        add(incomeBox);

        eduquli = new JLabel("Eductional ");
        eduquli.setBounds(40, 280, 500, 30);
        eduquli.setFont(new Font("Raleway", Font.BOLD, 18));
        add(eduquli);

        eduquli = new JLabel(" Qualification:");
        eduquli.setBounds(40, 300, 500, 30);
        eduquli.setFont(new Font("Raleway", Font.BOLD, 18));
        add(eduquli);

        eductionalBox = new JComboBox<String>(eductionalval);
        eductionalBox.setBackground(Color.WHITE);
        eductionalBox.setBounds(210, 295, 500, 30);
        eductionalBox.setFont(new Font(Font.DIALOG, Font.BOLD, 16));
        add(eductionalBox);

        occupation = new JLabel("Occupation:");
        occupation.setBounds(40, 340, 500, 40);
        occupation.setFont(new Font("Raleway", Font.BOLD, 18));
        add(occupation);

        occuptionBox = new JComboBox<String>(occupationval);
        occuptionBox.setBackground(Color.WHITE);
        occuptionBox.setBounds(210, 347, 500, 30);
        occuptionBox.setFont(new Font(Font.DIALOG, Font.BOLD, 16));
        add(occuptionBox);

        pan = new JLabel("PAN Number:");
        pan.setBounds(40, 390, 500, 40);
        pan.setFont(new Font("Raleway", Font.BOLD, 18));
        add(pan);

        pantf = new JTextField();
        pantf.setBounds(210, 397, 500, 30);
        pantf.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
        add(pantf);

        aadhar = new JLabel("Aadhar Number:");
        aadhar.setBounds(40, 440, 500, 40);
        aadhar.setFont(new Font("Raleway", Font.BOLD, 18));
        add(aadhar);

        aadhartf = new JTextField();
        aadhartf.setBounds(210, 447, 500, 30);
        aadhartf.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
        add(aadhartf);

        senior = new JLabel("Senior Citizen:");
        senior.setBounds(40, 495, 500, 40);
        senior.setFont(new Font("Raleway", Font.BOLD, 18));
        add(senior);

        yess = new JRadioButton("Yes");
        yess.setBounds(210, 500, 60, 30);
        yess.setBackground(Color.WHITE);
        add(yess);

        nos = new JRadioButton("No");
        nos.setBounds(280, 500, 60, 30);
        nos.setBackground(Color.WHITE);
        add(nos);

        seniorGroup = new ButtonGroup();
        seniorGroup.add(yess);
        seniorGroup.add(nos);

        exitac = new JLabel("Existing Account:");
        exitac.setBounds(40, 540, 500, 40);
        exitac.setFont(new Font("Raleway", Font.BOLD, 18));
        add(exitac);

        yesac = new JRadioButton("Yes");
        yesac.setBounds(210, 545, 60, 30);
        yesac.setBackground(Color.WHITE);
        add(yesac);

        noac = new JRadioButton("No");
        noac.setBounds(280, 545, 60, 30);
        noac.setBackground(Color.WHITE);
        add(noac);

        acountGroup = new ButtonGroup();
        acountGroup.add(yesac);
        acountGroup.add(noac);

        JButton next = new JButton("NEXT");
        next.setBackground(Color.RED);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 620, 80, 30);
        next.addActionListener(this);
        add(next);
    }

    public void actionPerformed(ActionEvent a) {
       String formno = formnum;
        String sreligion = (String) religonBox.getSelectedItem();
        String scategory = (String) categoryBox.getSelectedItem();
        String sincome = (String) incomeBox.getSelectedItem();
        String seduction = (String) eductionalBox.getSelectedItem();
        String soccuption = (String) occuptionBox.getSelectedItem();
        String seniorcitizen = null;

        if (yess.isSelected()) {
            seniorcitizen = "Yes";
        } else if (nos.isSelected()) {
            seniorcitizen = "No";
        }

        String existingaccount = null;
        if (yesac.isSelected()) {
            existingaccount = "Yes";
        } else if (noac.isSelected()) {
            existingaccount = "No";
        }

        String span = pantf.getText();
        String saadhar = aadhartf.getText();

        try {
            connection c = new connection();
            String query = "INSERT INTO signuptwo VALUES ('" + formno + "','" + sreligion + "','" + scategory + "','" + sincome + "','" + seduction+ "','" + soccuption + "','" + span + "','" + saadhar + "','" + seniorcitizen + "','" + existingaccount + "')";
            c.s.executeUpdate(query);

            setVisible(false);
            new signupthree(formno).setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
   

    public static void main(String[] args) {
        new signuptwo("").setVisible(true);
    }
}
// String query = "insert into signup
// values('"+name+"','"+fathername+"','"+income+"',,'"+eduquli+"',,'"+email+"',,'"+marital+"',,'"+address+"',,'"+city+"',,'"+pincode+"',,'"+state+"',)";
