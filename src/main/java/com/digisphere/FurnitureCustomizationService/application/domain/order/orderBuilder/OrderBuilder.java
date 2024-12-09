package com.digisphere.FurnitureCustomizationService.application.domain.order.orderBuilder;

import com.digisphere.FurnitureCustomizationService.application.domain.order.domain.Order;
import com.digisphere.FurnitureCustomizationService.application.domain.order.domain.component.OrderStatus;

import java.util.UUID;

public class OrderBuilder implements IOrderBuilder {
    private Order order = new Order();

    @Override
    public Order build() {
        var orderInstance = this.order;
        reset();
        return orderInstance;
    }

    @Override
    public void reset() {
        this.order = new Order();
    }

    @Override
    public void setOrderId(UUID orderId) {
        this.order.setOrderId(orderId);
    }

    @Override
    public void setCreatorsId(UUID creatorsId) {
        this.order.setCreatorsId(creatorsId);
    }

    @Override
    public void setProductId(UUID productId) {
        this.order.setProductId(productId);
    }

    @Override
    public void setPrice(Double price) {
        this.order.setPrice(price);
    }

    @Override
    public void setCategory(String category) {
        this.order.setCategory(category);
    }

    @Override
    public void setQuantity(Integer quantity) {
        this.order.setQuantity(quantity);
    }

    @Override
    public void setOrderStatus(String orderStatus) {
        this.order.setOrderStatus(OrderStatus.valueOf(orderStatus.toUpperCase()));
    }
}
