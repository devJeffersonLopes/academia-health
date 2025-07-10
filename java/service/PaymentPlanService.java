package service;

import dao.PaymentPlanDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.PaymentPlan;


public class PaymentPlanService {
    
    public PaymentPlan getPaymentPlanByName(String planName){
        PaymentPlanDAO paymentPlanDAO = new PaymentPlanDAO();
        
        PaymentPlan paymentPlan = new PaymentPlan();

        
        paymentPlan = paymentPlanDAO.findByName(planName);
        
        if(paymentPlan == null){
            throw new NullPointerException();
        }else{
            return paymentPlan;
        }
    }
    
    public PaymentPlan findById(int id){
        PaymentPlanDAO paymentPlanDAO = new PaymentPlanDAO();
        
        PaymentPlan paymentPlan = new PaymentPlan();

        
        paymentPlan = paymentPlanDAO.getPaymentPlanById(id);
        
        if(paymentPlan == null){
            throw new NullPointerException();
        }else{
            return paymentPlan;
        }
    }
     
    public ArrayList<PaymentPlan> getAllPaymentPlans(){
        PaymentPlanDAO paymentPlanDAO = new PaymentPlanDAO();
        
        ArrayList<PaymentPlan> paymentPlans = new ArrayList<>();
        
        paymentPlans = paymentPlanDAO.getAll();
        
        if(paymentPlans == null){
            throw new NullPointerException();
        }else{
            return paymentPlans;
        }
    }
    
}
