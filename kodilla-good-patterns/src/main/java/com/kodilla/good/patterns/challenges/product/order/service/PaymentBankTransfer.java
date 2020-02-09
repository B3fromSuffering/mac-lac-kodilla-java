package com.kodilla.good.patterns.challenges.product.order.service;

public class PaymentBankTransfer implements PaymentService {

    @Override
    public boolean pay(int price) {
        System.out.println("Transfer ordered");
        return true;
    }

    @Override
    public boolean validatePayment() {
        System.out.println("The transfer has reached the recipient");
        return true;
    }
}
