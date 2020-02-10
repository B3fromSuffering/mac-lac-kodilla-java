package com.kodilla.good.patterns.challenges.food2door;

public class OrderLoader {

    public Order loadOrder() {

        Provider providerName = new ProviderHealthyShop();
        String productName = "Yerba Mate Rosamonte 1kg";
        int productQuantity = 3;

        return new Order(providerName, productName, productQuantity);
    }
}
