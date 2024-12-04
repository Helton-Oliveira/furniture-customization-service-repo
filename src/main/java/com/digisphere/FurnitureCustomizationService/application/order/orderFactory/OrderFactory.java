package com.digisphere.FurnitureCustomizationService.application.order.orderFactory;

public class OrderFactory extends Factory{
    @Override
    public IOrder createOrder() {
        return new OrderProduct();
    }
}
