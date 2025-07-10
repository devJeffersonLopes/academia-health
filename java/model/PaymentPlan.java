package model;

import java.math.BigDecimal;


public class PaymentPlan {
    
    private int id;
    private String type;
    private String description;
    private int duration_months;
    private BigDecimal full_price;

    public PaymentPlan() {
    }

    public PaymentPlan(int id, String type, String description, int duration_months, BigDecimal full_price) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.duration_months = duration_months;
        this.full_price = full_price;
    }
    
    public PaymentPlan(PaymentPlan paymentPlan){
        this.id = paymentPlan.getId();
        this.type = paymentPlan.getType();
        this.description = paymentPlan.getDescription();
        this.duration_months = paymentPlan.getDuration_months();
        this.full_price = paymentPlan.getFull_price();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration_months() {
        return duration_months;
    }

    public void setDuration_months(int duration_months) {
        this.duration_months = duration_months;
    }

    public BigDecimal getFull_price() {
        return full_price;
    }

    public void setFull_price(BigDecimal full_price) {
        this.full_price = full_price;
    }
    
}
