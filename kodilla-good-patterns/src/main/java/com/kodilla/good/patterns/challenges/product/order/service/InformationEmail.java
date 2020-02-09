package com.kodilla.good.patterns.challenges.product.order.service;

public class InformationEmail implements InformationService{

    @Override
    public boolean sendInfoToBuyer(User buyer) {

        System.out.println("You purchased an item");

        return true;
    }

    @Override
    public boolean sendInfoToSeller(User seller) {

        System.out.println("You sold an item");

        return true;
    }
}
