package controller;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import service.LoginService;


public class LoginController {
    
    private LoginService loginService;

    public LoginController() {
        loginService = new LoginService();
    }
    
    public void hidePassword(JPasswordField txtPassword){
        loginService.togglePasswordVisibility(txtPassword);
    }
    
    public void authenticate(JFrame currentFrame, JFrame newFrame, JTextField txtEmail, JPasswordField txtPassword){
        String email = txtEmail.getText();
        String password = new String(txtPassword.getPassword());
        
        if(loginService.validateLoginInput(email, password)){
            if(loginService.authenticate(email, password)){
                 newFrame.setVisible(true);
                 currentFrame.dispose();
            }
        }
    }
}
