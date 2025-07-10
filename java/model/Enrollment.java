package model;

import java.time.LocalDate;


public class Enrollment {
    
    private int id;
    private int member_id;
    private int payment_plan_id;
    private LocalDate registration_date;
    private String status;
    private LocalDate plan_end_date;

    public Enrollment() {
    }

    public Enrollment(int id, int member_id, LocalDate registration_date, String status) {
        this.id = id;
        this.member_id = member_id;
        this.registration_date = registration_date;
        this.status = status;
    }
    
    public Enrollment(int id, int member_id, int payment_plan_id, LocalDate registration_date, String status, LocalDate plan_end_date) {
        this.id = id;
        this.member_id = member_id;
        this.payment_plan_id = payment_plan_id;
        this.registration_date = registration_date;
        this.status = status;
        this.plan_end_date = plan_end_date;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public int getPayment_plan_id() {
        return payment_plan_id;
    }

    public void setPayment_plan_id(int payment_plan_id) {
        this.payment_plan_id = payment_plan_id;
    }

    public LocalDate getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(LocalDate registration_date) {
        this.registration_date = registration_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getPlan_end_date() {
        return plan_end_date;
    }

    public void setPlan_end_date(LocalDate plan_end_date) {
        this.plan_end_date = plan_end_date;
    }
    
    
}
