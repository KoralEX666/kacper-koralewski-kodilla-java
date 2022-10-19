
package com.kodilla.good.patterns.challenges;
public class ProductOrderService {

    private final InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final SaleRequest saleRequest) {
        boolean isSold = orderService.sale(saleRequest.getUser(), saleRequest.getDate(), saleRequest.getProduct(), saleRequest.getQuantity());

        if (isSold) {
            informationService.inform(saleRequest.getUser());
            orderRepository.createOrder(saleRequest.getUser(), saleRequest.getDate(), saleRequest.getProduct(), saleRequest.getQuantity());
            return new OrderDto(saleRequest.getUser(), true);
        } else {
            return new OrderDto(saleRequest.getUser(), false);
        }
    }
}