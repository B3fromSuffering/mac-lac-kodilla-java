package com.kodilla.good.patterns.challenges.product.order.service;

public class TransactionServiceImplementation implements TransactionService {

    @Override
    public boolean buyItem(User seller, User buyer, Item item) {
        System.out.println("User: " + buyer.getName() + " bought: " + item.getName());
        return true;
    }
}
