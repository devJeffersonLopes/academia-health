package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import model.Enrollment;


public class EnrollmentDAO {
    
    public boolean insert(Enrollment enrollment){
        try{
            Connection con = ConnectionFactory.getConnection();
            
            String sql = "INSERT INTO enrollments (member_id, payment_plan_id, status, plan_end_date) "
                    + "VALUES (?, ?, ?, ?)";
            
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

            String sql = "DELETE FROM enrollments WHERE id = ?";

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
                enrollment.setPayment_plan_id(readNullableInt(rs.getInt("payment_plan_id")));
                enrollment.setRegistration_date(rs.getDate("registration_date").toLocalDate());
                enrollment.setStatus(rs.getString("status"));
                enrollment.setPlan_end_date(toLocalDateSafe(rs.getDate("plan_end_date")));
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
                enrollment.setPayment_plan_id(readNullableInt(rs.getInt("payment_plan_id")));
                enrollment.setRegistration_date(rs.getDate("registration_date").toLocalDate());
                enrollment.setStatus(rs.getString("status"));
                enrollment.setPlan_end_date(toLocalDateSafe(rs.getDate("plan_end_date")));
            }

            return Optional.ofNullable(enrollment);
            
        }catch(SQLException e){
            e.printStackTrace();
            return Optional.empty();
        }
    }
    
    public List<Enrollment> findAll(){
        
        ArrayList<Enrollment> enrollments = new ArrayList<>();
        
        try{
            Connection con = ConnectionFactory.getConnection();
            
            String sql = "SELECT * FROM enrollments";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Enrollment enrollment = new Enrollment();
                
                enrollment.setId(rs.getInt("id"));
                enrollment.setMember_id(rs.getInt("member_id"));
                enrollment.setPayment_plan_id(readNullableInt(rs.getInt("payment_plan_id")));
                enrollment.setRegistration_date(rs.getDate("registration_date").toLocalDate());
                enrollment.setStatus(rs.getString("status"));
                enrollment.setPlan_end_date(toLocalDateSafe(rs.getDate("plan_end_date")));
                
                enrollments.add(enrollment);
            }

            return enrollments;
            
        }catch(SQLException e){
            e.printStackTrace();
            return enrollments;
        }
    }
   
    /*
        O método toLocalDateSafe() serve para receber valores Date do banco de dados
        que podem ser nulos e devem ser convertidos para LocalDate dentro da aplicação
        através do método toLocalDate, um método que não aceita valores nulos.
    
        OBS: campos que nunca retornarem valores nulos, como um campo já preenchido pela
        cláusula DEFAULT não precisam dessa validação, pois aquela coluna nunca vai ser nula.
    */
    
    private LocalDate toLocalDateSafe(Date date){
         if(date == null){
             return null;
         }else{
             return date.toLocalDate();
         }
         
    }
    
    /*
        O método readNullableInt() faz uma verificação em colunas do tipo int retornadas
        pelo ResultSet, pois por padrão, o método ResultSet.getInt() nunca retorna null em 
        um campo de tipo int, pois o tipo primitivo int em Java não aceita valores null.
    
        Para corrigir esse problema e evitar falsos valores zero, o método abaixo faz uma verificação
        simples, retornando um objeto Integer com valor null caso o parâmetro inserido seja zero, e 
        caso o parâmetro seja 1 ou maior, o método simplesmente retorna ele de volta como um integer.
    
        Esse método só é necessário para capturar colunas que são do tipo INT em SQL que podem estar nulas,
        como em chaves estrangeiras Nullable. Já em campos que envolvem financeiro, por exemplo,
        isso não se aplica pois o valor zero realmente pode significar zero, e não ausência de valor (null),
        e isso por si só pressupõe que o banco de dados seja modelado com tal campo inserido com a cláusula
        NOT NULL, já que um campo que representa o financeiro não pode estar ausente.
    */
    
    private Integer readNullableInt(int value){
        if(value == 0){
            return null;
        }else{
            return value;
        }
    }
    
}
