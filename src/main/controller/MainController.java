package main.controller;

import main.views.MainWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.views.CustomerWindow;
import main.model.Customer;
import main.model.MainModel;
import main.views.Register;



public class MainController implements ActionListener {
    
    
    MainWindow mWindow;
    MainModel model;
    
    
    public MainController(){
        this.mWindow = new MainWindow(this);
        this.model = new MainModel();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Log In")) {
        String un = mWindow.getUserEMAIL();
        String pw = mWindow.getUserPassword();
        
        Customer user = new Customer(un, pw);
                
        boolean result = model.login(user);
                
        
        if(!result){
            mWindow.getLogInFailed();
        }
        
        
        else{
            
            new CustomerWindow();
            this.mWindow.dispose();
        }
        
        }
        else if (e.getActionCommand().equals("Join Us Now")) {
            new Register();
                this.mWindow.dispose();
        }
     
      
        
    }
        
    

    
}

