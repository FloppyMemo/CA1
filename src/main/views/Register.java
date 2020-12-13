package main.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Register extends JFrame {
    JComboBox dropDown;
    
    public Register (){
       
        
        JPanel panelTop = new JPanel();
        JPanel panelLeft = new JPanel();
        JPanel panelRight = new JPanel();
        JPanel panelBotton = new JPanel();
        JPanel panelCenter = new JPanel();
        JLabel myHeader = new JLabel("BARBER");
        String [] dropList = { "Register As:", "Customer" , "Partner" };
        dropDown = new JComboBox(dropList);
        JLabel fullName = new JLabel("Full Name:");
        JLabel mobileNumber = new JLabel("Mobile Number:");
        JTextField nameField = new JTextField(25);
        JTextField mobileField = new JTextField(25);
        JLabel passWordField = new JLabel("Password:");
        JLabel myLocation = new JLabel("Location:");
        JTextField myLocationField = new JTextField(25);
        JTextField passField = new JTextField(25);
        JButton register = new JButton("Register");
        
        ImageIcon image = new ImageIcon("barber.png");
        
        panelTop.setBackground(Color.white);
        panelLeft.setBackground(Color.white);
        panelRight.setBackground(Color.white);
        panelBotton.setBackground(Color.white);
        panelCenter.setBackground(Color.white);
        
        panelTop.setPreferredSize(new Dimension(100,100));
        panelLeft.setPreferredSize(new Dimension(100,100));
        panelRight.setPreferredSize(new Dimension(100,100));
        panelBotton.setPreferredSize(new Dimension(100,100));
        panelCenter.setPreferredSize(new Dimension(130,130));
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(550,550);
        this.setResizable(false);
        this.setLayout(new BorderLayout(10,10));
        this.add(panelTop,BorderLayout.NORTH);
        this.add(panelLeft,BorderLayout.WEST);
        this.add(panelRight,BorderLayout.EAST);
        this.add(panelBotton,BorderLayout.SOUTH);
        this.add(panelCenter,BorderLayout.CENTER);
        this.setIconImage(image.getImage());

        panelTop.add(myHeader);
        
        panelLeft.add(dropDown);
        panelCenter.add(fullName);
        panelCenter.add(nameField);
        panelCenter.add(mobileNumber);
        panelCenter.add(mobileField);
        panelCenter.add(passWordField);
        panelCenter.add(passField);
        panelCenter.add(myLocation);
        panelCenter.add(myLocationField);
        panelCenter.add(register);
//        passField.setVisible(false);
        
        
        
        
        
        
        
        
        
        

 
        this.setVisible(true);
        this.validate();
        this.repaint();
        
    }

//    private boolean getCustomer() {
//        
//        JLabel fullName = new JLabel("Full Name:");
//        
//        
//    }
    
    
}
