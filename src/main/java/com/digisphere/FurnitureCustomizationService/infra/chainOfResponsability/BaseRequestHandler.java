package com.digisphere.FurnitureCustomizationService.infra.chainOfResponsability;

import com.digisphere.FurnitureCustomizationService.infra.errorHandler.CustomError;

import java.util.List;
import java.util.Map;

public class BaseRequestHandler implements IRequestHandler{
    private IRequestHandler next;

    protected void next(IRequestHandler handler) {
        this.next = handler;
    }

    @Override
    public void valid(Map<String, String> fields, List<String> keys) {
        if (!fields.containsKey("category") || fields.get("category").isBlank()) throw new RuntimeException("ERRO CAMPO (CATEGORIA) NECESSÁRIO PARA GERAR PEDIDO");
        keys.forEach((key) -> {
            if (!fields.containsKey(key)) throw new CustomError("ERRO! CAMPO " + key + " NECESSÁRIO PARA CONTINUAR");
            if (fields.get(key).isBlank()) throw new CustomError("ERRO! CAMPO " + key + " DEVE CONTER UM VALOR");
        });

        this.next(new UserValidationHandler());
    }
}
