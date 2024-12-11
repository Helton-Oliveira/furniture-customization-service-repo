package com.digisphere.FurnitureCustomizationService.application.domain.order.orderBuilder;

import com.digisphere.FurnitureCustomizationService.application.domain.order.domain.Order;

import java.util.UUID;

public interface IOrderBuilder {
    void reset();
    void setOrderId(UUID orderId);
    void setProductId(UUID productId);
    void setCostumerId(UUID costumerId);
    void setPrice(Double price);
    void setQuantity(Integer quantity);
    void setOrderStatus(String orderStatus); // String para ser convertido externamente
    Order build();
}
