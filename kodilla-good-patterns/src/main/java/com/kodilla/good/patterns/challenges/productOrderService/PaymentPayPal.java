package com.kodilla.good.patterns.challenges.productOrderService;

public class PaymentPayPal implements PaymentService {

    @Override
    public boolean pay() {
        return false;
    }

    @Override
    public boolean validatePayment() {
        return false;
    }
}
