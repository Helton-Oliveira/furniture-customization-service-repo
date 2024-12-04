package com.digisphere.FurnitureCustomizationService.application.order.domain;

import com.digisphere.FurnitureCustomizationService.application.order.domain.component.OrderStatus;

import java.util.UUID;

public class Order {
    private UUID orderId;
    private UUID creatorsId;
    private UUID productId;
    private Double price;
    private String category;
    private Integer quantity;
    private OrderStatus orderStatus;

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public void setCreatorsId(UUID creatorsId) {
        this.creatorsId = creatorsId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", creatorsId=" + creatorsId +
                ", productId=" + productId +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
