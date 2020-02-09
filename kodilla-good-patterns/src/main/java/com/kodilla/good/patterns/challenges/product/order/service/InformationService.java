package com.kodilla.good.patterns.challenges.product.order.service;

public interface InformationService {

    public boolean sendInfoToBuyer(User buyer);

    public boolean sendInfoToSeller(User seller);
}
