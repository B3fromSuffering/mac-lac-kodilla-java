package com.kodilla.good.patterns.challenges.productOrderService;

public class Item {

    private String name;
    private String category;
    private int price;
    private User seller;

    public Item(String name, String category, int price, User seller) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.seller = seller;
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

    public User getSeller() {
        return seller;
    }
}
