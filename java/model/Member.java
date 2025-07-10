package model;

import java.time.LocalDate;


public class Member {
    
    private int id;
    private String full_name;
    private String email;
    private String cpf;
    private String rg;
    private String phone;
    private String whatsapp;
    private LocalDate birth_date;

    public Member() {
    }
    
    public Member(String full_name, String email, String cpf, String rg, String phone, String whatsapp, LocalDate date) {
        this.full_name = full_name;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this.phone = phone;
        this.whatsapp = whatsapp;
        this.birth_date = date;
    }
    
    public Member(Member member){
        this.id = member.getId();
        this.full_name = member.getFull_name();
        this.email = member.getEmail();
        this.cpf = member.getCpf();
        this.rg = member.getRg();
        this.phone = member.getPhone();
        this.whatsapp = member.getWhatsapp();
        this.birth_date = member.getBirth_date();
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
    
}
