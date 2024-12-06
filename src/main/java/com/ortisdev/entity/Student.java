package com.ortisdev.entity;

public class Student {
    private int id;
    private String name;
    private String cpf;
    private  String email;
    private String phone;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
