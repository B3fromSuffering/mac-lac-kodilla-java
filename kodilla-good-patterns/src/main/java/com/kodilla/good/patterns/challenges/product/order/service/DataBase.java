package com.kodilla.good.patterns.challenges.product.order.service;

public class DataBase implements DataBaseService {

    User seller;
    User buyer;
    Item item;
    boolean validatePayment;

    @Override
    public boolean saveTransactionData(User buyer, User seller, Item item, boolean validatePayment) {

        this.seller = seller;
        this.buyer = buyer;
        this.item = item;
        this.validatePayment = validatePayment;
        System.out.println("Transaction data saved in data base");

        return true;
    }
}

