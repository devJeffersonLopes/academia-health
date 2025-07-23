package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import model.Employee;


public class EmployeeDAO {
    
    public boolean insert(Employee employee){
        try{
            Connection con = ConnectionFactory.getConnection();

            String sql = "INSERT INTO employees (full_name, email, cpf, rg, phone, whatsapp, birth_date, position, salary, payment_day) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, employee.getFull_name());
            stmt.setString(2, employee.getEmail());
            stmt.setString(3, employee.getCpf());
            stmt.setString(4, employee.getRg());
            stmt.setString(5, employee.getPhone());
            stmt.setString(6, employee.getWhatsapp());
            stmt.setDate(7, Date.valueOf(employee.getBirth_date()));
            stmt.setString(8, employee.getPosition());
            stmt.setBigDecimal(9, employee.getSalary());
            stmt.setInt(10, employee.getPayment_day());
            
            int rowsAffected = stmt.executeUpdate();
            
            if(rowsAffected >= 1){
                return true;
            }else{
                return false;
            }
            
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean update(int id, Employee employee){
        try{
            Connection con = ConnectionFactory.getConnection();
            
            String sql = "UPDATE employees"
                    + " SET full_name = ?,"
                    + " email = ?,"
                    + " cpf = ?,"
                    + " rg = ?,"
                    + " phone = ?,"
                    + " whatsapp = ?,"
                    + " birth_date = ?,"
                    + " position = ?,"
                    + " salary = ?,"
                    + " payment_day = ?"
                    + " WHERE id = ?";
                    
            PreparedStatement stmt = con.prepareStatement(sql);     
            
            stmt.setString(1, employee.getFull_name());
            stmt.setString(2, employee.getEmail());
            stmt.setString(3, employee.getCpf());
            stmt.setString(4, employee.getRg());
            stmt.setString(5, employee.getPhone());
            stmt.setString(6, employee.getWhatsapp());
            stmt.setDate(7, Date.valueOf(employee.getBirth_date()));
            stmt.setString(8, employee.getPosition());
            stmt.setBigDecimal(9, employee.getSalary());
            stmt.setInt(10, employee.getPayment_day());
            stmt.setInt(11, id);
            
            int rowsAffected = stmt.executeUpdate();
            
            if(rowsAffected >= 1){
                return true;
            }else{
                return false;
            }
            
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean delete(int id){
        try{
            Connection con = ConnectionFactory.getConnection();
            
            String sql = "DELETE FROM employees WHERE id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, id);
            
            int rowsAffected = stmt.executeUpdate();
            
            if(rowsAffected >= 1){
                return true;
            }else{
                return false;
            }
            
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public Optional<Employee> findById(int id){
        try{
            Connection con = ConnectionFactory.getConnection();
            
            String sql = "SELECT * FROM employees WHERE id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            Employee employee = new Employee();
            
            while(rs.next()){
                employee.setId(rs.getInt("id"));
                employee.setFull_name(rs.getString("full_name"));
                employee.setEmail(rs.getString("email"));
                employee.setPassword(rs.getString("password"));
                employee.setCpf(rs.getString("cpf"));
                employee.setRg(rs.getString("rg"));
                employee.setPhone(rs.getString("phone"));
                employee.setWhatsapp(rs.getString("Whatsapp"));
                employee.setBirth_date(rs.getDate("birth_date").toLocalDate());
                employee.setPosition(rs.getString("position"));
                employee.setSalary(rs.getBigDecimal("salary"));
                employee.setPayment_day(rs.getInt("payment_day"));
            }
            
            return Optional.ofNullable(employee);
            
        }catch(SQLException e){
            e.printStackTrace();
            return Optional.empty();
        }
        
    }
    
    public List<Employee> findAll(){
        
        ArrayList<Employee> employees = new ArrayList<>();
        
        try{
            Connection con = ConnectionFactory.getConnection();
            
            String sql = "SELECT * FROM employees";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Employee employee = new Employee();
                
                employee.setId(rs.getInt("id"));
                employee.setFull_name(rs.getString("full_name"));
                employee.setEmail(rs.getString("email"));
                employee.setPassword(rs.getString("password"));
                employee.setCpf(rs.getString("cpf"));
                employee.setRg(rs.getString("rg"));
                employee.setPhone(rs.getString("phone"));
                employee.setWhatsapp(rs.getString("Whatsapp"));
                employee.setBirth_date(rs.getDate("birth_date").toLocalDate());
                employee.setPosition(rs.getString("position"));
                employee.setSalary(rs.getBigDecimal("salary"));
                employee.setPayment_day(rs.getInt("payment_day"));
                
                employees.add(employee);
            }
            
            return employees;
            
        }catch(SQLException e){
            e.printStackTrace();
            return employees;
        }
    }
    
    public Optional<Employee> findByEmail(String email) {
        try{
            Connection con = ConnectionFactory.getConnection();

            String sql = "SELECT * FROM employees WHERE email = ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, email);

            ResultSet rs = stmt.executeQuery();

            Employee employee = new Employee();
            
            if(rs.next()){
                employee.setId(rs.getInt("id"));
                employee.setFull_name(rs.getString("full_name"));
                employee.setEmail(rs.getString("email"));
                employee.setPassword(rs.getString("password"));
                employee.setCpf(rs.getString("cpf"));
                employee.setRg(rs.getString("rg"));
                employee.setPhone(rs.getString("phone"));
                employee.setWhatsapp(rs.getString("whatsapp"));
                employee.setBirth_date(rs.getDate("birth_date").toLocalDate());
                employee.setPosition(rs.getString("position"));
                employee.setSalary(rs.getBigDecimal("salary"));
                employee.setPayment_day(rs.getInt("payment_day"));
            }
            
            return Optional.ofNullable(employee);
            
        }catch(SQLException e){
              e.printStackTrace();
              return Optional.empty();
        }
    }
    
    public Optional<String> findPasswordHashById(int id){
        try{
            Connection con = ConnectionFactory.getConnection();
            
            String sql = "SELECT password FROM employees WHERE id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                String hash = rs.getString("password");
                
                return Optional.ofNullable(hash);
            }
            
            return Optional.empty();
            
        }catch(SQLException e){
            e.printStackTrace();
            return Optional.empty();
        }
    }
    
    public boolean updatePassword(int id, String hash){
        try{
            Connection con = ConnectionFactory.getConnection();
            
            String sql = "UPDATE employees SET password = ? WHERE id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, hash);
            stmt.setInt(2, id);
            
            int rowsAffected = stmt.executeUpdate();
            
            if(rowsAffected >= 1){
                return true;
            }else{
                return false;
            }
            
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
}
