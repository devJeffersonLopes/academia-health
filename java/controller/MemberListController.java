package controller;

import dao.EnrollmentDAO;
import dao.MemberDAO;
import javax.swing.JFrame;
import javax.swing.JTable;
import model.Enrollment;
import model.Member;
import model.PaymentPlan;
import service.EnrollmentService;
import service.MemberService;
import service.PaymentPlanService;
import view.membercrud.UpdateMember;
import view.membercrud.VisualizeMember;


public class MemberListController {
    
    private MemberService memberService;

    public MemberListController() {
        memberService = new MemberService();
    }
    
    
    public void fillMembersTable(JTable table, String name){
        memberService.fillMembersTable(table, name);
    }
    
    public void visualizeMember(JFrame currentFrame, int memberId){
        Member member = new Member();
        Enrollment enrollment = new Enrollment();
        PaymentPlan paymentPlan = new PaymentPlan();
        
        MemberService memberService = new MemberService();
        EnrollmentService enrollmentService = new EnrollmentService();
        PaymentPlanService paymentPlanService = new PaymentPlanService();
        
        
        member = memberService.findMemberById(memberId);
        enrollment = enrollmentService.findByMemberId(memberId);
        
        int planId = enrollment.getPayment_plan_id();
        
        paymentPlan = paymentPlanService.findById(planId);
        
        
        VisualizeMember visualizeMember = new VisualizeMember(member, enrollment, paymentPlan);
        visualizeMember.setTitle("Visualizar aluno");
        
        visualizeMember.setVisible(true);
        
        currentFrame.dispose();
    }
    
    public int deleteMember(int memberId){
        return memberService.delete(memberId);
    }
    
    public void updateMember(JFrame currentFrame, int memberId){
        Member member = new Member();
        Enrollment enrollment = new Enrollment();
        
        MemberDAO memberDAO = new MemberDAO();
        EnrollmentDAO enrollmentDAO = new EnrollmentDAO();
        
        
        member = memberDAO.findById(memberId);
        enrollment = enrollmentDAO.findByMemberId(memberId);
        
        UpdateMember updateMember = new UpdateMember(member, enrollment);
        updateMember.setTitle("Atualizar aluno");
        
        updateMember.setVisible(true);
        
        currentFrame.dispose();
    }
    
    public int getSelectedMemberId(JTable table){
        
        int selectedRow = table.getSelectedRow();
        
        if(selectedRow >= 0){
            int id = (int) table.getValueAt(selectedRow, 0); 
            return id;
        }else{
            throw new RuntimeException("Nenhum registro está selecionado");
        }
    }
}
