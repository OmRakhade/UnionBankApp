import java.awt.event.ActionEvent;
// import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class home extends JFrame implements ActionListener {
    JFrame f;
    String cardnum;
    String num;
    JLabel heading, heading1, heading3,heading2;
    JButton check, credit, debit,logout;

    home(String card_no) {
        this.cardnum = card_no;
        setSize(1200, 700);

        setLocation(30, 0);
        setVisible(true);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel image = new JLabel(new ImageIcon("D:\\Java\\union-logo.png"));
        image.setBounds(40, -80, 1200, 300);
        add(image);

        heading = new JLabel("Welcome back");
        heading.setBounds(70, 250, 400, 60);
        heading.setFont(new Font(Font.DIALOG, Font.BOLD, 18));
        add(heading);
        heading1 = new JLabel(cardnum);
        heading1.setBounds(60, 280, 500, 60);
        heading1.setFont(new Font(Font.DIALOG, Font.BOLD, 25));
        add(heading1);


        heading3 = new JLabel("Task you can perform");
        heading3.setBounds(450, 180, 700, 60);
        heading3.setFont(new Font(Font.DIALOG, Font.BOLD, 40));
        add(heading3);

        check = new JButton("Check Balance");
        check.setBounds(600, 300, 150, 30);
        check.setBackground(Color.RED);
        check.setForeground(Color.WHITE);
        check.addActionListener(this);
        add(check);

        credit = new JButton("Credit Amount");
        credit.setBounds(600, 400, 150, 30);
        credit.setBackground(Color.RED);
        credit.setForeground(Color.WHITE);
        credit.addActionListener(this);
        add(credit);

        debit = new JButton("Debited Amount");
        debit.setBounds(600, 500, 150, 30);
        debit.setBackground(Color.RED);
        debit.setForeground(Color.WHITE);
        debit.addActionListener(this);
        add(debit);

        heading2 = new JLabel("Copyright@copy,UNIONBANK");
        heading2.setBounds(70, 580, 7150, 60);
        heading2.setFont(new Font(Font.DIALOG, Font.BOLD, 10));
        add(heading2);

        heading2 = new JLabel("Creadted by :-");
        heading2.setBounds(70, 600, 7150, 60);
        heading2.setFont(new Font(Font.DIALOG, Font.BOLD, 10));
        add(heading2);

        heading2 = new JLabel("Om AnirudhaRao Rakhade");
        heading2.setBounds(70, 620, 7150, 60);
        heading2.setFont(new Font(Font.DIALOG, Font.BOLD, 10));
        add(heading2);

        heading2 = new JLabel("Aditya Ghuge");
        heading2.setBounds(70, 640, 7150, 60);
        heading2.setFont(new Font(Font.DIALOG, Font.BOLD, 10));
        add(heading2);

        logout = new JButton("Log out");
        logout.setBounds(1000, 600, 100, 30);
        logout.setBackground(Color.RED);
        logout.setForeground(Color.WHITE);
        logout.addActionListener(this);
        add(logout);

    }

    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==check) {
            connection c = new connection();
            String query = "SELECT balance FROM user WHERE card_no ='"+cardnum+"'";
            System.out.println("connection established");
            try {
                // PreparedStatement stmt = c.prepareStatement(query);
                ResultSet rs = c.s.executeQuery(query);
                System.out.println("query executed successfully");
                System.out.println(rs);
                if(rs.next()) {
                    double balance = rs.getDouble("balance");
                    JOptionPane.showMessageDialog(null, "Current balance: Rs. "+balance);
                    System.out.println("matched");
                } else {
                    JOptionPane.showMessageDialog(null, "User not found");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        if (ae.getSource()==logout) {
            setVisible(false);
            new index().setVisible(true);
        }
    }
    


    public static void main(String[] args) {
        new home("cardnum");
    }
}
