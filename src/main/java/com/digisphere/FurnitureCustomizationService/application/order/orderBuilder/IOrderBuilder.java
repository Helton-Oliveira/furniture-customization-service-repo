package com.digisphere.FurnitureCustomizationService.application.order.orderBuilder;

import com.digisphere.FurnitureCustomizationService.application.order.domain.Order;

import java.util.UUID;

public interface IOrderBuilder {
    void reset();
    void setOrderId(UUID orderId);
    void setCreatorsId(UUID creatorsId);
    void setProductId(UUID productId);
    void setPrice(Double price);
    void setCategory(String category);
    void setQuantity(Integer quantity);
    void setOrderStatus(String orderStatus); // String para ser convertido externamente
    Order build();
}
