package model;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Employee {
    
    private int id;
    private String full_name;
    private String email;
    private String password;
    private String cpf;
    private String rg;
    private String phone;
    private String whatsapp;
    private LocalDate birth_date;
    private String position;
    private BigDecimal salary;
    private int payment_day;

    public Employee() {
    }

    public Employee(int id, String full_name, String email, String password, String cpf, String rg, String phone, String whatsapp, LocalDate birth_date, String position, BigDecimal salary, int payment_day) {
        this.id = id;
        this.full_name = full_name;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.rg = rg;
        this.phone = phone;
        this.whatsapp = whatsapp;
        this.birth_date = birth_date;
        this.position = position;
        this.salary = salary;
        this.payment_day = payment_day;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public int getPayment_day() {
        return payment_day;
    }

    public void setPayment_day(int payment_day) {
        this.payment_day = payment_day;
    }
    
}
