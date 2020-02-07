package com.kodilla.good.patterns.challenges.productOrderService;

public class InformationEmail implements InformationService{

    @Override
    public boolean sendInfoToBuyer() {

        System.out.println("You purchased an item");

        return true;
    }

    @Override
    public boolean sendInfoToSeller() {

        System.out.println("You sold an item");

        return true;
    }
}
