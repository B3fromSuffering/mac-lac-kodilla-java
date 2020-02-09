package com.kodilla.good.patterns.challenges.product.order.service;

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


    public void putItemForSale(String name, String category, int price){
        Item item = new Item(name, category, price);
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
