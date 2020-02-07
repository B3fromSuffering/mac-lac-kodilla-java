package com.kodilla.good.patterns.challenges.productOrderService;

public class User {

    private String name;
    private int id;
    private String address;
    private String email;
    private String phoneNumber;

    public User(String name, int id, String address, String email, String phoneNumber) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void buyItem(){

    }

    public void sellItem(){

    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
