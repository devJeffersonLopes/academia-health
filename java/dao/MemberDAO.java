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
import model.Member;


public class MemberDAO {
    
    public boolean insert(Member member) {
        try{
            Connection con = ConnectionFactory.getConnection();

            String sql = "INSERT INTO members (full_name, email, cpf, rg, phone, whatsapp, birth_date)"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, member.getFull_name());
            stmt.setString(2, member.getEmail());
            stmt.setString(3, member.getCpf());
            stmt.setString(4, member.getRg());
            stmt.setString(5, member.getPhone());
            stmt.setString(6, member.getWhatsapp());
            stmt.setDate(7, Date.valueOf(member.getBirth_date())); //Date ou SQLDate?

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
    
    public boolean update(int id, Member member) {
        try{
            Connection con = ConnectionFactory.getConnection();

            String sql = "UPDATE members"
                    + " SET full_name = ?,"
                    + " email = ?,"
                    + " cpf = ?,"
                    + " rg = ?,"
                    + " phone = ?,"
                    + " whatsapp = ?,"
                    + " birth_date = ?"
                    + " WHERE id = ?";

            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, member.getFull_name());
            stmt.setString(2, member.getEmail());
            stmt.setString(3, member.getCpf());
            stmt.setString(4, member.getRg());
            stmt.setString(5, member.getPhone());
            stmt.setString(6, member.getWhatsapp());
            stmt.setDate(7, Date.valueOf(member.getBirth_date()));
            stmt.setInt(8, id);

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
    
    public boolean delete(int id) {
        try{
            Connection con = ConnectionFactory.getConnection();

            String sql = "DELETE * FROM members WHERE id = ?";

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
    
    public Optional<Member> findById(int id) {
        try{
            Connection con = ConnectionFactory.getConnection();

            String sql = "SELECT * FROM members WHERE id = ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();

            Member member = new Member();

            while(rs.next()){
                member.setId(rs.getInt("id"));
                member.setFull_name(rs.getString("full_name"));
                member.setEmail(rs.getString("email"));
                member.setCpf(rs.getString("cpf"));
                member.setRg(rs.getString("rg"));
                member.setPhone(rs.getString("phone"));
                member.setWhatsapp(rs.getString("whatsapp"));
                member.setBirth_date(rs.getDate("birth_date").toLocalDate());
            }

            return Optional.ofNullable(member);
            
        }catch(SQLException e){
            e.printStackTrace();
            return Optional.empty();
        }
    }
    
    public Optional<List<Member>> findAll() {
        try{
            Connection con = ConnectionFactory.getConnection();

            String sql = "SELECT * FROM members";

            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            ArrayList<Member> members = new ArrayList<>();

            while(rs.next()){
                Member member = new Member();
                
                member.setId(rs.getInt("id"));
                member.setFull_name(rs.getString("full_name"));
                member.setEmail(rs.getString("email"));
                member.setCpf(rs.getString("cpf"));
                member.setRg(rs.getString("rg"));
                member.setPhone(rs.getString("phone"));
                member.setWhatsapp(rs.getString("whatsapp"));
                member.setBirth_date(rs.getDate("birth_date").toLocalDate());  
                
                members.add(member);
            }
            
            return Optional.ofNullable(members);
            
        }catch(SQLException e){
            e.printStackTrace();
            return Optional.empty();
        }
    }
    
    public Optional<List<Member>> findByName(String name) {
        try{
            Connection con = ConnectionFactory.getConnection();

            String sql = "SELECT * FROM members WHERE full_name LIKE ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, name + "%");

            ResultSet rs = stmt.executeQuery();

            ArrayList<Member> members = new ArrayList<>();

            while(rs.next()){
                Member member = new Member();

                member.setId(rs.getInt("id"));
                member.setFull_name(rs.getString("full_name"));
                member.setEmail(rs.getString("email"));
                member.setCpf(rs.getString("cpf"));
                member.setRg(rs.getString("rg"));
                member.setPhone(rs.getString("phone"));
                member.setWhatsapp(rs.getString("whatsapp"));
                member.setBirth_date(rs.getDate("birth_date").toLocalDate());

                members.add(member);
            }

            return Optional.ofNullable(members);
            
        }catch(SQLException e){
            e.printStackTrace();
            return Optional.empty();
        }
    }
    
}
