package controller;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import model.Member;
import model.PaymentPlan;
import service.MembershipContractService;
import service.PaymentPlanService;
import view.membercrud.FinalizeRegistration;


public class MemberRegistrationController {
    
    MembershipContractService membershipContractService = new MembershipContractService();
    
    public void sendDataToFinalizeRegistration(JFrame currentFrame, Member member, PaymentPlan paymentPlan){
        FinalizeRegistration finalizeRegistration = new FinalizeRegistration(member, paymentPlan);
        
        finalizeRegistration.setTitle("Finalizar registro");
        finalizeRegistration.setVisible(true);
        
        currentFrame.dispose();
    }
    
    public PaymentPlan getSelectedPaymentPlan(JComboBox boxPaymentPlan){
        PaymentPlanService paymentPlanService = new PaymentPlanService();
        PaymentPlan paymentPlan = new PaymentPlan();
        
        String planName = (String) boxPaymentPlan.getSelectedItem();
        
        paymentPlan = paymentPlanService.getPaymentPlanByName(planName);
        
        return paymentPlan;
    }
    
    public void fillPlanComboBox(JComboBox boxPaymentPlan){
        PaymentPlanService paymentPlanService = new PaymentPlanService();
        
        ArrayList<PaymentPlan> paymentPlans = new ArrayList<>();
        paymentPlans.addAll(paymentPlanService.getAllPaymentPlans());
        
        for (int i = 0; i < paymentPlans.size(); i++) {
            PaymentPlan paymentPlan = new PaymentPlan(paymentPlans.get(i));
            
            boxPaymentPlan.addItem(paymentPlan.getType());
        }
    }
    
    
    public void generateMembershipContract(String memberFullName){
        membershipContractService.view(memberFullName);
    }
}
