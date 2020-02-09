package com.kodilla.good.patterns.challenges.product.order.service;

public class PurchaseOrderLoader {

    public PurchaseOrder load() {

        User seller = new User("Adam", 123456, "Rowerowa 2, 10-100 Wieś", "adas77@xyz.com", "678094529");
        Item item = new Item("Rower Merida", "Pojazdy", 2000);

        User buyer = new User("Basia", 743214, "Towarowa 23-100 Miasto", "bbhv@xyz.com", "849384923");

        PaymentService payment = new PaymentBankTransfer();
        ShippingService shipment = new ShippingDHL();

        return new PurchaseOrder(buyer, seller, item, payment, shipment);
    }
}
