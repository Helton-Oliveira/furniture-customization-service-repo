package com.digisphere.FurnitureCustomizationService.application.order.orderBuilder;

import com.digisphere.FurnitureCustomizationService.application.order.domain.Order;

import java.util.Map;

public interface IOrderDirector {
    Order createOrder(Map<String, String> data);
}
