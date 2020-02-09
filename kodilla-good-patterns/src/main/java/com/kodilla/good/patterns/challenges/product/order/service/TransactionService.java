package com.kodilla.good.patterns.challenges.product.order.service;

public interface TransactionService {

    public boolean buyItem(User seller, User buyer, Item item);
}
