package com.digisphere.FurnitureCustomizationService.application.utils;

import java.util.List;
import java.util.Map;

public class RequestValidator {

    public static void validateRequestFields(Map<String, String> fields, List<String> keys) {
        if (!fields.containsKey("category") || fields.get("category").isBlank()) throw new RuntimeException("ERRO CAMPO (CATEGORIA) NECESSÁRIO PARA GERAR PEDIDO");
        keys.forEach((key) -> {
            if (!fields.containsKey(key)) throw new RuntimeException("ERRO! CAMPO " + key + " NECESSÁRIO PARA CONTINUAR");
            if (fields.get(key).isBlank()) throw new RuntimeException("ERRO! CAMPO " + key + " DEVE CONTER UM VALOR");
        });
    }


}
