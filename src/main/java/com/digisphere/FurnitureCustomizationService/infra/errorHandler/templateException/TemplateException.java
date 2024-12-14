package com.digisphere.FurnitureCustomizationService.infra.errorHandler.templateException;

import org.springframework.http.ResponseEntity;

public class TemplateException {

    public static ResponseEntity<?> executeBadRequestException(Throwable e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }

}
