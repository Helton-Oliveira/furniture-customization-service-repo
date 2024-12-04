package com.digisphere.FurnitureCustomizationService.application.order.orderFactory;

import java.util.Map;

public interface IOrder {
    void validate(Map<String, String> data);
    void build(Map<String, String> data);
    Boolean save();
}
