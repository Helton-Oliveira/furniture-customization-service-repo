package com.digisphere.FurnitureCustomizationService.Order;

import com.digisphere.FurnitureCustomizationService.application.order.orderFactory.Factory;
import com.digisphere.FurnitureCustomizationService.application.order.orderFactory.OrderFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class GenerateOrderTest {

    @Test
    @DisplayName("Deve geraar e publica um pedido")
    void generateOrder() {
        Map<String, String> data = new HashMap<>();
        data.put("orderId", UUID.randomUUID().toString());
        data.put("creatorsId", UUID.randomUUID().toString());
        data.put("productId", UUID.randomUUID().toString());
        data.put("price", "199.99");
        data.put("quantity", "3");

        Factory orderFactory = new OrderFactory();
        String orderResult = orderFactory.processOrder(data);
        assertThat(orderResult).isEqualTo("PEDIDO GERADO COM SUCESSO");
    }
}
