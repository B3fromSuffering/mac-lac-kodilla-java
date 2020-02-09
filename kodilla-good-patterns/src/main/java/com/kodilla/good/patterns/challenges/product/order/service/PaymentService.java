package com.kodilla.good.patterns.challenges.product.order.service;

public interface PaymentService {

    public boolean pay(int price);

    public boolean validatePayment();
}
