
package main.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CustomerWindow extends JFrame {
    
        JComboBox dropDownC;
    
        public CustomerWindow (){
       
        JPanel panelTop = new JPanel();
        JPanel panelLeft = new JPanel();
        JPanel panelRight = new JPanel();
        JPanel panelBotton = new JPanel();
        JPanel panelCenter = new JPanel();
        JLabel myHeader = new JLabel("BARBER");
        JMenuBar menuBar = new JMenuBar();
        JMenu homeMenu = new JMenu("Home");
        JMenu appointmentMenu = new JMenu("My Appointments");
        JMenu reviewMenu = new JMenu("Reviews");
        JMenu logOutMenu = new JMenu("Log Out");
        String [] dropList = { "Search by:", "Name" , "Location" };
        dropDownC = new JComboBox(dropList);
        JLabel SearchName = new JLabel("Welcome Username");
        JTextField SearchField = new JTextField(25);
        JButton SearchButton = new JButton("Search");
        
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
        menuBar.add(homeMenu);
        menuBar.add(appointmentMenu);
        menuBar.add(reviewMenu);
        menuBar.add(logOutMenu);
        this.setResizable(false);
        this.setLayout(new BorderLayout(10,10));
        this.add(panelTop,BorderLayout.NORTH);
        this.add(panelLeft,BorderLayout.WEST);
        this.add(panelRight,BorderLayout.EAST);
        this.add(panelBotton,BorderLayout.SOUTH);
        this.add(panelCenter,BorderLayout.CENTER);
        this.setIconImage(image.getImage());

        panelTop.add(myHeader);
        panelCenter.add(menuBar);
        panelLeft.add(dropDownC);
        panelCenter.add(SearchName);
        panelCenter.add(SearchField);
        panelCenter.add(SearchButton);
        
        
        this.setVisible(true);
        this.validate();
        this.repaint();
        
    }
    
    
}
