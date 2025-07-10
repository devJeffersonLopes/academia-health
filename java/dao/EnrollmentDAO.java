package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import model.Enrollment;


public class EnrollmentDAO {
    
    public boolean insert(Enrollment enrollment){
        try{
            Connection con = ConnectionFactory.getConnection();
            
            String sql = "INSERT INTO enrollments (member_id, payment_plan_id, status, plan_end_date) "
                    + "VALUES (?, ?, ?, ?, ?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, enrollment.getMember_id());
            stmt.setInt(2, enrollment.getPayment_plan_id());
            stmt.setString(3, enrollment.getStatus());
            stmt.setDate(4, Date.valueOf(enrollment.getPlan_end_date()));
            
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
    
    public boolean update(int id, Enrollment enrollment){
        try{
            Connection con = ConnectionFactory.getConnection();
            
            String sql = "UPDATE enrollments"
                    + " SET member_id = ?,"
                    + " payment_plan_id = ?,"
                    + " status = ?,"
                    + " plan_end_date = ?"
                    + " WHERE id = ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, enrollment.getMember_id());
            stmt.setInt(2, enrollment.getPayment_plan_id());
            stmt.setString(3, enrollment.getStatus());
            stmt.setDate(4, Date.valueOf(enrollment.getPlan_end_date()));
            
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

            String sql = "DELETE * FROM enrollments WHERE id = ?";

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
    
    public Optional<Enrollment> findById(int id) {
        try{
            Connection con = ConnectionFactory.getConnection();

            String sql = "SELECT * FROM enrollments WHERE id = ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();

            Enrollment enrollment = new Enrollment();

            while(rs.next()){
                enrollment.setId(rs.getInt("id"));
                enrollment.setMember_id(rs.getInt("member_id"));
                enrollment.setPayment_plan_id(rs.getInt("payment_plan_id"));
                enrollment.setRegistration_date(rs.getDate("payment_plan_id").toLocalDate());
                enrollment.setStatus(rs.getString("status"));
                enrollment.setPlan_end_date(rs.getDate("plan_end_date").toLocalDate());
            }

            return Optional.ofNullable(enrollment);
            
        }catch(SQLException e){
            e.printStackTrace();
            return Optional.empty();
        }
    }
    
    public Optional<Enrollment> findByMemberId(int memberId) {
        try{
            Connection con = ConnectionFactory.getConnection();

            String sql = "SELECT * FROM enrollments WHERE member_id = ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, memberId);

            ResultSet rs = stmt.executeQuery();

            Enrollment enrollment = new Enrollment();

            while(rs.next()){
                enrollment.setId(rs.getInt("id"));
                enrollment.setMember_id(rs.getInt("member_id"));
                enrollment.setPayment_plan_id(rs.getInt("payment_plan_id"));
                enrollment.setRegistration_date(rs.getDate("payment_plan_id").toLocalDate());
                enrollment.setStatus(rs.getString("status"));
                enrollment.setPlan_end_date(rs.getDate("plan_end_date").toLocalDate());
            }

            return Optional.ofNullable(enrollment);
            
        }catch(SQLException e){
            e.printStackTrace();
            return Optional.empty();
        }
    }
    
    public Optional<List<Enrollment>> findAll(){
        try{
            Connection con = ConnectionFactory.getConnection();
            
            String sql = "SELECT * FROM enrollments";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            ArrayList<Enrollment> enrollments = new ArrayList<>();

            while(rs.next()){
                Enrollment enrollment = new Enrollment();
                
                enrollment.setId(rs.getInt("id"));
                enrollment.setMember_id(rs.getInt("member_id"));
                enrollment.setPayment_plan_id(rs.getInt("payment_plan_id"));
                enrollment.setRegistration_date(rs.getDate("payment_plan_id").toLocalDate());
                enrollment.setStatus(rs.getString("status"));
                enrollment.setPlan_end_date(rs.getDate("plan_end_date").toLocalDate());
                
                enrollments.add(enrollment);
            }

            return Optional.ofNullable(enrollments);
            
        }catch(SQLException e){
            e.printStackTrace();
            return Optional.empty();
        }
    }
   
}
