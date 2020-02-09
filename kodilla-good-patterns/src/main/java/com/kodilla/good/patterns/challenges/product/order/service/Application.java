package com.kodilla.good.patterns.challenges.product.order.service;

public class Application {

    public static void main(String[] args) {
        PurchaseOrderLoader purchaseOrderLoader = new PurchaseOrderLoader();
        PurchaseOrder purchaseOrder = purchaseOrderLoader.load();

        ProductOrderService productOrderService = new ProductOrderService(
                new TransactionServiceImplementation(), new DataBase(), new InformationEmail());
        productOrderService.process(purchaseOrder);

    }
}
