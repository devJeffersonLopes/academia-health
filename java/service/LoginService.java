package service;

import dao.EmployeeDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import model.Employee;
import org.mindrot.jbcrypt.BCrypt;


public class LoginService {
    
    public boolean authenticate(String email, String senha){
        
        EmployeeDAO employeeDAO = new EmployeeDAO();
        Employee employee = new Employee();
        
        try{
            employee = employeeDAO.findByEmail(email);
            
          
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao consultar o banco de dados!");
            e.printStackTrace();
            return false;
        }
        
        String hash = employee.getPassword();
        
        if(verifyPassword(senha, hash)){
            JOptionPane.showMessageDialog(null, "Seja bem vindo, "+ employee.getFull_name());
            return true;
            
        }else{
            JOptionPane.showMessageDialog(null, "A senha está incorreta");
            return false;
        }
        
    }
    
    public boolean validateLoginInput(String email, String senha){
        
        if(email.equals("") || senha.equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, preencha os campos em branco");
            return false;
        }
        
        if(!email.contains("@")){
            JOptionPane.showMessageDialog(null, "O email não está no formato correto");
            return false;
        }
        
        if(!email.contains("@academiahealth.com")){
            JOptionPane.showMessageDialog(null, "Este endereço de email não é da nossa empresa");
            return false;
        }
        
        return true;
    }
    
    public void togglePasswordVisibility(JPasswordField txtPassword){ 
        if (txtPassword.getEchoChar() == '*') {
            txtPassword.setEchoChar((char) 0);
        } else {
            txtPassword.setEchoChar('*');
        }
    }
    
    public static String hashPassword(String password){
        return BCrypt.hashpw(password, BCrypt.gensalt(12));
    }
    
    public static boolean verifyPassword(String password, String hashedPassword){
        return BCrypt.checkpw(password, hashedPassword);
    }
    
}
