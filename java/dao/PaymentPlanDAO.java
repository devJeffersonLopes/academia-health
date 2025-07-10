package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import model.PaymentPlan;


public class PaymentPlanDAO {
    
    public boolean insert(PaymentPlan paymentPlan){
        try{
            Connection con = ConnectionFactory.getConnection();
            
            String sql = "INSERT INTO payment_plans (type, description, duration_months, full_price) "
                    + "VALUES (?, ?, ?, ?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, paymentPlan.getType());
            stmt.setString(2, paymentPlan.getDescription());
            stmt.setInt(3, paymentPlan.getDuration_months());
            stmt.setBigDecimal(4, paymentPlan.getFull_price());
            
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
    
    public boolean update(int id, PaymentPlan paymentPlan){
        try{
            Connection con = ConnectionFactory.getConnection();
            
            String sql = "UPDATE payment_plans"
                    + " SET type = ?,"
                    + " description = ?,"
                    + " duration_months = ?,"
                    + " full_price = ?"
                    + " WHERE id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, paymentPlan.getType());
            stmt.setString(2, paymentPlan.getDescription());
            stmt.setInt(3, paymentPlan.getDuration_months());
            stmt.setBigDecimal(4, paymentPlan.getFull_price());
            stmt.setInt(5, id);
            
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
            
            String sql = "DELETE * FROM payment_plans WHERE id = ?";
            
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
    
    public Optional<PaymentPlan> findById(int id){
        try{
            Connection con = ConnectionFactory.getConnection();
            
            String sql = "SELECT * FROM payment_plans WHERE id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            PaymentPlan paymentPlan = new PaymentPlan();
            
            while(rs.next()){
                paymentPlan.setId(rs.getInt("id"));
                paymentPlan.setType(rs.getString("type"));
                paymentPlan.setDescription(rs.getString("description"));
                paymentPlan.setDuration_months(rs.getInt("duration_months"));
                paymentPlan.setFull_price(rs.getBigDecimal("full_price"));
            }
            
            return Optional.ofNullable(paymentPlan);
            
        }catch(SQLException e){
            e.printStackTrace();
            return Optional.empty();
        }
    }
    
    public Optional<PaymentPlan> findByType(String planType){
        try{
            Connection con = ConnectionFactory.getConnection();

            String sql = "SELECT * FROM payment_plans WHERE type = ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, planType);
                    
            ResultSet rs = stmt.executeQuery();

            PaymentPlan paymentPlan = new PaymentPlan();
            
            while(rs.next()){
                paymentPlan.setId(rs.getInt("id"));
                paymentPlan.setType(rs.getString("type"));
                paymentPlan.setDescription(rs.getString("description"));
                paymentPlan.setDuration_months(rs.getInt("duration_months"));
                paymentPlan.setFull_price(rs.getBigDecimal("full_price"));
            }
            
            return Optional.ofNullable(paymentPlan);
            
        }catch(SQLException e){
            e.printStackTrace();
            return Optional.empty();
        }
    }
    
    public Optional<List<PaymentPlan>> getAll() {
        try{
            Connection con = ConnectionFactory.getConnection();

            String sql = "SELECT * FROM payment_plans";

            PreparedStatement stmt = con.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            ArrayList<PaymentPlan> paymentPlans = new ArrayList<>();

            while(rs.next()){
                PaymentPlan paymentPlan = new PaymentPlan();

                paymentPlan.setId(rs.getInt("id"));
                paymentPlan.setType(rs.getString("type"));
                paymentPlan.setDescription(rs.getString("description"));
                paymentPlan.setDuration_months(rs.getInt("duration_months"));
                paymentPlan.setFull_price(rs.getBigDecimal("full_price"));

                paymentPlans.add(paymentPlan);
            }

            return Optional.ofNullable(paymentPlans);
            
        }catch(SQLException e){
            e.printStackTrace();
            return Optional.empty();
        }
    }
    
}
