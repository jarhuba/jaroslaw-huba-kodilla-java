package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private InformationService informationService;
    private PaymentServce paymentServce;
    private WarehouseService warehouseService;

    public OrderProcessor(final InformationService informationService,
                          final PaymentServce paymentServce,
                          final WarehouseService warehouseService) {
        this.informationService = informationService;
        this.paymentServce = paymentServce;
        this.warehouseService = warehouseService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isPayed = paymentServce.process(orderRequest.getBasket());
        if (isPayed) {
            informationService.sendInformationSuccesfullPayment(orderRequest.getUser());
            warehouseService.sendToUser(orderRequest.getUser(), orderRequest.getBasket());
        } else {
            informationService.sendInformationUnsuccesfullPayment(orderRequest.getUser());
        }
        return new OrderDto(orderRequest, isPayed);

    }
}
