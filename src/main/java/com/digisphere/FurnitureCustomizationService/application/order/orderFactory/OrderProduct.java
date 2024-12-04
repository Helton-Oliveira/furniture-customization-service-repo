package com.digisphere.FurnitureCustomizationService.application.order.orderFactory;

import com.digisphere.FurnitureCustomizationService.application.order.domain.Order;
import com.digisphere.FurnitureCustomizationService.application.order.domain.component.OrderStatus;
import com.digisphere.FurnitureCustomizationService.application.order.utils.ValidateRequestFields;

import java.util.Map;
import java.util.UUID;

public class OrderProduct implements IOrder {
    private Order order;

    @Override
    public void validate(Map<String, String> data) {
        ValidateRequestFields.valid(data);
    }

    @Override
    public void build(Map<String, String> data) {
        this.order = new Order();
        validate(data);
        order.setOrderId(UUID.randomUUID());
        order.setCreatorsId(UUID.fromString(data.get("creatorsId")));
        order.setProductId(UUID.fromString(data.get("productId")));
        order.setCategory("FURNITURE");
        order.setPrice(Double.valueOf(data.get("price")));
        order.setQuantity(Integer.parseInt(data.get("quantity")));
        order.setOrderStatus(OrderStatus.PENDING);
    }

    @Override
    public Boolean save() {
        return order != null;
    }
}
