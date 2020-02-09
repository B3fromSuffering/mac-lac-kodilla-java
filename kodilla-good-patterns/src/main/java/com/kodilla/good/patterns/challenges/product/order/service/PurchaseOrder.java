package com.kodilla.good.patterns.challenges.product.order.service;

public class PurchaseOrder {

    private User seller;
    private User buyer;
    private Item item;
    private PaymentService payment;
    private ShippingService shipment;

    public PurchaseOrder(User seller, User buyer, Item item, PaymentService payment, ShippingService shipment) {
        this.seller = seller;
        this.buyer = buyer;
        this.item = item;
        this.payment = payment;
        this.shipment = shipment;
    }

    public User getSeller() {
        return seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public Item getItem() {
        return item;
    }

    public PaymentService getPayment() {
        return payment;
    }

    public ShippingService getShipment() {
        return shipment;
    }
}

