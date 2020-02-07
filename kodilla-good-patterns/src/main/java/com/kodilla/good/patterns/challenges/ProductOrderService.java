package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.challenges.productOrderService.*;

public class ProductOrderService {

    private TransactionService transactionService;
    private DataBaseService dataBaseService;
    private InformationService informationService;
    private PaymentService paymentService;
    private ShippingService shippingService;

    public ProductOrderService(final TransactionService transactionService, final DataBaseService dataBaseService,
                               final InformationService informationService, final PaymentService paymentService,
                               final ShippingService shippingService) {
        this.transactionService = transactionService;
        this.dataBaseService = dataBaseService;
        this.informationService = informationService;
        this.paymentService = paymentService;
        this.shippingService = shippingService;
    }

    public ProductOrderServiceDto process()
}
