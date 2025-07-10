package service;

import dao.EnrollmentDAO;
import java.sql.SQLException;
import model.Enrollment;


public class EnrollmentService {
    
    public Enrollment findByMemberId(int memberId){
        Enrollment enrollment = new Enrollment();
        EnrollmentDAO enrollmentDAO = new EnrollmentDAO();
        
        enrollment = enrollmentDAO.findByMemberId(memberId);
        
        if(enrollment != null){
           return enrollment;
       }else{
           throw new RuntimeException("Não foi possível buscar a matrícula");
       }
    }
    
    public int update(int id, Enrollment enrollment){
        EnrollmentDAO enrollmentDAO = new EnrollmentDAO();
        
        try{
            return enrollmentDAO.update(id, enrollment);
        }catch(SQLException e){
            System.out.println("Não foi possível atualizar o registro da matrícula");
            return 0;
        }
    }
}
