package com.digisphere.FurnitureCustomizationService.application.directors;

import com.digisphere.FurnitureCustomizationService.application.order.domain.component.OrderStatus;
import com.digisphere.FurnitureCustomizationService.application.order.orderBuilder.IOrderBuilder;
import com.digisphere.FurnitureCustomizationService.application.order.orderBuilder.OrderBuilder;

import java.util.Map;
import java.util.UUID;

public class OrderDirector implements IDirector {
    private final IOrderBuilder order = new OrderBuilder();

    @Override
    public <T> T create(Map<String, String> data) {
        order.setOrderId(UUID.randomUUID());
        order.setCreatorsId(UUID.fromString(data.get("creatorsId")));
        order.setProductId(UUID.fromString(data.get("productId")));
        order.setCategory("FURNITURE");
        order.setPrice(Double.valueOf(data.get("price")));
        order.setQuantity(Integer.parseInt(data.get("quantity")));
        order.setOrderStatus(String.valueOf(OrderStatus.PENDING));
        return (T) order.build();
    }
}