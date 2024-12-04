package com.digisphere.FurnitureCustomizationService.application.order.utils;

import java.util.Map;

public class ValidateRequestFields {

    public static void valid(Map<String, String> data) {
        checkEmptyFields(data);
        checkEmptyKeys(data);
        checkEmptyValues(data);
    }

    private static void checkEmptyFields(Map<String, String> fields) {
        if(fields.isEmpty()) throw new RuntimeException("ERRO NA REQUISICAO");
    }

    private static void checkEmptyKeys(Map<String, String> fields) {
        fields.keySet().forEach((key) -> {
            if(key.isBlank() || key.isEmpty()) throw new RuntimeException("ERRO NA KEY");
        });
    }

    private static void checkEmptyValues(Map<String, String> fields) {
        fields.values().forEach((value) -> {
            if(value.isBlank() || value.isEmpty()) throw new RuntimeException("ERRO NA KEY");
        });
    }
}
