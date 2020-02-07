package com.kodilla.good.patterns.challenges.productOrderService;

public class PaymentBankTransfer implements PaymentService {

    @Override
    public boolean pay() {
        return false;
    }

    @Override
    public boolean validatePayment() {
        return false;
    }
}
