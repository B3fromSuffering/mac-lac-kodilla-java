package com.kodilla.good.patterns.challenges.product.order.service;

public interface DataBaseService {

    public boolean saveTransactionData(User buyer, User seller, Item item, boolean validatePayment);
}
