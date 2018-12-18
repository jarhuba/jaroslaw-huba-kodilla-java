package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private InformationService informationService;
    private PaymentServce paymentServce;
    private OrderService orderService;
    private WarehouseService warehouseService;

    public OrderProcessor(final InformationService informationService,
                          final PaymentServce paymentServce,
                          final OrderService orderService,
                          final WarehouseService warehouseService) {
        this.informationService = informationService;
        this.paymentServce = paymentServce;
        this.orderService = orderService;
        this.warehouseService = warehouseService;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getBasket());
        boolean isPayed = false;
        if (isOrdered) {
            isPayed = paymentServce.process(orderRequest.getBasket());
        }

        if (isPayed && isOrdered) {
            informationService.sendInformationSuccesfullPayment(orderRequest.getUser());
            warehouseService.sendToUser(orderRequest.getUser(), orderRequest.getBasket());
        } else if (isOrdered) {
            informationService.sendInformationUnsuccesfullPayment(orderRequest.getUser());
        }
        return new OrderDto(orderRequest, isPayed, isOrdered);

    }
}
