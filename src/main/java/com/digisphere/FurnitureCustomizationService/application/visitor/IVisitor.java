package com.digisphere.FurnitureCustomizationService.application.visitor;

import com.digisphere.FurnitureCustomizationService.application.domain.order.domain.Order;

public interface IVisitor {
    void visit(Order order);
}
