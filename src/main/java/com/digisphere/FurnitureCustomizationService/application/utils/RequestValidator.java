package com.digisphere.FurnitureCustomizationService.application.utils;

import java.util.List;
import java.util.Map;

public class RequestValidator {

    public static void validateRequestFields(Map<String, String> fields, List<String> keys) {
        keys.forEach((key) -> {
            if (!fields.containsKey(key)) throw new RuntimeException("ERRO! CAMPO " + key + " NECESSÁRIO PARA CONTINUAR");
            if (fields.get(key).isBlank()) throw new RuntimeException("ERRO! CAMPO " + key + " DEVE CONTER UM VALOR");
        });
    }

    public static void validateFurnitureCategory(Map<String, String> req) {
        if (!req.containsKey("category") || req.get("category").isBlank()) throw new RuntimeException("ERRO CAMPOR (CATEGORIA) NECESSÁRIO PARA GERAR PEDIDO");
    }
}
