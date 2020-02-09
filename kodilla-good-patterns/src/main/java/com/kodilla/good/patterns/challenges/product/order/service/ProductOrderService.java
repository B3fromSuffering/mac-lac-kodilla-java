package com.kodilla.good.patterns.challenges.product.order.service;

public class ProductOrderService {

    private TransactionService transactionService;
    private DataBaseService dataBaseService;
    private InformationService informationService;

    public ProductOrderService(final TransactionService transactionService, final DataBaseService dataBaseService,
                               final InformationService informationService) {
        this.transactionService = transactionService;
        this.dataBaseService = dataBaseService;
        this.informationService = informationService;
    }

    public ProductOrderServiceDto process(PurchaseOrder purchaseOrder) {
        boolean transactionConfirmed = transactionService.buyItem(purchaseOrder.getSeller(), purchaseOrder.getBuyer(), purchaseOrder.getItem());
        if (transactionConfirmed) {
            purchaseOrder.getPayment().pay(purchaseOrder.getItem().getPrice());
            purchaseOrder.getShipment().sendParcel();
            informationService.sendInfoToBuyer(purchaseOrder.getBuyer());
            informationService.sendInfoToSeller(purchaseOrder.getSeller());
            dataBaseService.saveTransactionData(purchaseOrder.getSeller(), purchaseOrder.getBuyer(), purchaseOrder.getItem(), purchaseOrder.getPayment().validatePayment());
            return new ProductOrderServiceDto(purchaseOrder.getItem(), true);
        } else {
            return new ProductOrderServiceDto(purchaseOrder.getItem(), false);
        }
    }
}
