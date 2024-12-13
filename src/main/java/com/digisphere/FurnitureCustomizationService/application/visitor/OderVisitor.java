package com.digisphere.FurnitureCustomizationService.application.visitor;

import com.digisphere.FurnitureCustomizationService.application.domain.order.domain.Order;
import com.digisphere.FurnitureCustomizationService.infra.apiRequester.ApiRequester;

import java.util.HashMap;
import java.util.Map;

public class OderVisitor implements IVisitor{

    @Override
    public void visit(Order order) {
        Map<String, String> reqData = new HashMap<>();
        reqData.put("orderId", order.getOrderId().toString());
        reqData.put("productId", order.getProductId().toString());
        reqData.put("creatorsCpf", order.getCostumerCpf());
        reqData.put("price", String.valueOf(order.getPrice()));
        reqData.put("quantity", String.valueOf(order.getQuantity()));
        reqData.put("orderStatus", order.getOrderStatus().name());

        //ApiRequester.postData("http://localhost:8080/orders", reqData, "/create");

        System.out.println("ocorreu tudo certo!");
    }
}
