package main.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import main.controller.MainController;
/*
 @author junio
 */
public class MainWindow extends JFrame {
JTextField emailField;
JTextField passwordField;
    MainController mController;
    JButton joinButton;
    
    public MainWindow (MainController mController){
        this.mController = mController;
        
        JPanel panelTop = new JPanel();
        JPanel panelLeft = new JPanel();
        JPanel panelRight = new JPanel();
        JPanel panelBotton = new JPanel();
        JPanel panelCenter = new JPanel();
        JLabel myHeader = new JLabel("BARBER");
        JLabel labelImageL = new JLabel();
        JLabel labelImageR = new JLabel();
        JLabel labelId = new JLabel("User Email:");
        JLabel labelPw = new JLabel("Password:");
        ImageIcon imageI = new ImageIcon("barber.png");       
        ImageIcon image = new ImageIcon("logo.png");
        labelImageL.setIcon(imageI);
        labelImageR.setIcon(imageI);
        emailField = new JTextField(25);
        passwordField = new JPasswordField(25);
        JButton logButton = new JButton("Log In");
        logButton.setActionCommand("Log In");
        logButton.addActionListener(mController);
       
        
        
        JButton joiButton = new JButton("Join Us Now");
        joiButton.setActionCommand("Join Us Now");
        joiButton.addActionListener(mController);
        
        
 
        
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
        this.setVisible(true);
        this.setLayout(new BorderLayout(10,10));
        this.add(panelTop,BorderLayout.NORTH);
        this.add(panelLeft,BorderLayout.WEST);
        this.add(panelRight,BorderLayout.EAST);
        this.add(panelBotton,BorderLayout.SOUTH);
        this.add(panelCenter,BorderLayout.CENTER);
        this.setIconImage(image.getImage());
        this.add(emailField);

        
        panelTop.add(myHeader);
        
        panelLeft.add(labelImageL);
        panelRight.add(labelImageR);
        
        panelBotton.add(joiButton);
        
        panelCenter.add(labelId);
        panelCenter.add(emailField);
        panelCenter.add(labelPw);
        panelCenter.add(passwordField);
        panelCenter.add(logButton);
        
        
        
        
validation();
        
    }
    
        // Validation and repainting
    private void validation(){
        this.validate();
        this.repaint();
    }
    
    // Getters for username and password
    public String getUserEMAIL(){
        return emailField.getText();
    }
    public String getUserPassword(){
        return passwordField.getText();
    }
    public void getLogInFailed (){
        JOptionPane.showMessageDialog(this,"Wrong Credentials", "Log-in Failed", PLAIN_MESSAGE);
    }
    

    
    
}
