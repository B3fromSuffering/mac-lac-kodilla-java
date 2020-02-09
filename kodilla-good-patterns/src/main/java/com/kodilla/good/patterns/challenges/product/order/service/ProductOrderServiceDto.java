package com.kodilla.good.patterns.challenges.product.order.service;

public class ProductOrderServiceDto {

    private Item item;
    private boolean transactionConfirmed;

    public ProductOrderServiceDto(final Item item, final boolean transactionConfirmed) {

        this.item = item;
        this.transactionConfirmed = transactionConfirmed;
    }

    public Item getItem() {
        return item;
    }

    public boolean isTransactionConfirmed() {
        return transactionConfirmed;
    }
}

