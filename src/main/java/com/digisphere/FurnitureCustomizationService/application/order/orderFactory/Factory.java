package com.digisphere.FurnitureCustomizationService.application.order.orderFactory;

import java.util.Map;

public abstract class Factory {
    public abstract IOrder createOrder();

    public String processOrder(Map<String, String> data){
        var order = createOrder();
        order.build(data);
        var result = order.save();
        if (!result) throw new RuntimeException("ERRO AO GERAR PEDIDO TENTE NOVAMENTE MAIS TARDE...");
        return "PEDIDO GERADO COM SUCESSO";
    }
}
