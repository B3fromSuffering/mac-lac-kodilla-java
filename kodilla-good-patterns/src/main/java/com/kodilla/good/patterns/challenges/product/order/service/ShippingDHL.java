package com.kodilla.good.patterns.challenges.product.order.service;

public class ShippingDHL implements ShippingService{

    @Override
    public boolean sendParcel() {
        System.out.println("Parcel sent");
        return true;
    }

    @Override
    public boolean TrackParcel() {
        System.out.println("Parcel on the way");
        return true;
    }
}
