package service;

import dao.EnrollmentDAO;
import dao.MemberDAO;
import dao.PaymentPlanDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Enrollment;
import model.Member;
import model.MemberWithEnrollmentDTO;
import model.PaymentPlan;


public class MemberService {
    
    public void fillMembersTable(JTable table, String name){
        
        MemberDAO memberDAO = new MemberDAO();
        ArrayList<Member> members = new ArrayList<>(memberDAO.findByName(name));
        
        DefaultTableModel tableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; 
            }
        };
        
        tableModel.setColumnIdentifiers(new String[]{"ID", "Nome", "Data de nascimento"});
        
        
        for(int i = 0; i < members.size(); i++){
            Member member = members.get(i);
            
            Object[] row = {
                member.getId(),
                member.getFull_name(),
                member.getBirth_date()
            };
                    
            tableModel.addRow(row);
        }
        
        table.setModel(tableModel);
    }

    public void fillPaymentPlansList(JComboBox caixa){
        PaymentPlanDAO paymentPlanDAO = new PaymentPlanDAO();
        ArrayList<PaymentPlan> payment_plans = new ArrayList<>();
        
        payment_plans.addAll(paymentPlanDAO.getAll());
        
        for (int i = 0; i < payment_plans.size(); i++) {
            caixa.addItem(payment_plans.get(i).getType());
        }
    }
    
    public MemberWithEnrollmentDTO findById(int id){
       MemberDAO memberDAO = new MemberDAO();
       EnrollmentDAO enrollmentDAO = new EnrollmentDAO();
       
       Member member = new Member();
       Enrollment enrollment = new Enrollment();
       
       member = memberDAO.findById(id);
       enrollment = enrollmentDAO.findByMemberId(id);
       
       if(member != null && enrollment != null){
           MemberWithEnrollmentDTO memberWithEnrollmentDTO = new MemberWithEnrollmentDTO(member, enrollment);
           return memberWithEnrollmentDTO;
       }else{
           throw new RuntimeException("Não foi possível buscar o aluno com sua matrícula");
       }
    }
    
    public Member findMemberById(int id){
        MemberDAO memberDAO = new MemberDAO();
        Member member = new Member();
        
        member = memberDAO.findById(id);
        
        if(member != null){
            return member;
       }else{
           throw new RuntimeException("Não foi possível buscar o aluno com sua matrícula");
       }
    }
    
    public int delete(int id){
        MemberDAO memberDAO = new MemberDAO();
        
        return memberDAO.delete(id);
    }
    
    public int update(int id, Member member){
        MemberDAO memberDAO = new MemberDAO();
        
        try{
            return memberDAO.update(id, member);
        }catch(SQLException e){
            System.out.println("Não foi possível atualizar o registro do aluno");
            return 0;
        }
    }
    
}
