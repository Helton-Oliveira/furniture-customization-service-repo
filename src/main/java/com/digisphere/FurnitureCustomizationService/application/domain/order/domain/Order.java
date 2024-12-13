package com.digisphere.FurnitureCustomizationService.application.domain.order.domain;

import com.digisphere.FurnitureCustomizationService.application.domain.order.domain.component.OrderStatus;
import com.digisphere.FurnitureCustomizationService.application.visitor.IElement;
import com.digisphere.FurnitureCustomizationService.application.visitor.IVisitor;

import java.util.UUID;

public class Order implements IElement {
    private UUID orderId;
    private UUID productId;
    private String costumerCpf;
    private Double price;
    private Integer quantity;
    private OrderStatus orderStatus;

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public UUID getProductId() {
        return productId;
    }

    public String getCostumerCpf() {
        return costumerCpf;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public void setCostumerCpf(String costumerCpf) {
        this.costumerCpf = costumerCpf;
    }

    public void setPrice(Double price) {
        this.price = price;
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
                ", productId=" + productId +
                ", price=" + price +
                ", quantity=" + quantity +
                ", orderStatus=" + orderStatus +
                '}';
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
