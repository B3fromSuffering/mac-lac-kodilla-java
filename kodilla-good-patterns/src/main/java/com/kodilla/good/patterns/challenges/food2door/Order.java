package com.kodilla.good.patterns.challenges.food2door;

public class Order {

    private Provider providerName;
    private String productName;
    private int productQuantity;

    public Order(Provider providerName, String productName, int productQuantity) {
        this.providerName = providerName;
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public Provider getProviderName() {
        return providerName;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
