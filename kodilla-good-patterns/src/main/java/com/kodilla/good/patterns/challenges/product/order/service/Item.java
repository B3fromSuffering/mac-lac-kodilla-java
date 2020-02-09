package com.kodilla.good.patterns.challenges.product.order.service;

public class Item {

    private String name;
    private String category;
    private int price;

    public Item(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }
}
