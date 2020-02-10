package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {

    private Provider provider;

    public OrderProcessor(Provider provider) {
        this.provider = provider;
    }

    public boolean processOrder(Order order) {

        if (provider.process(order.getProductName(), order.getProductQuantity())) {
            System.out.println("Dziękujemy za skorzystanie z usług Food2Door!");
            return true;

        } else {
            System.out.println("Coś poszło nie tak :(");
            return false;
        }
    }
}
