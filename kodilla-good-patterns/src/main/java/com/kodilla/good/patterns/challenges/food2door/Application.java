package com.kodilla.good.patterns.challenges.food2door;

public class Application {

    public static void main(String[] args) {

        OrderLoader orderLoader = new OrderLoader();
        Order order = orderLoader.loadOrder();
        OrderProcessor orderProcessor = new OrderProcessor(order.getProviderName());
        orderProcessor.processOrder(order);
    }
}
