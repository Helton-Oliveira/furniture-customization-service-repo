package com.digisphere.FurnitureCustomizationService.infra.errorHandler;

import org.springframework.validation.FieldError;

public record ArgumentDataException(String field, String message) {
    public ArgumentDataException(FieldError field) {
        this(field.getField(), field.getDefaultMessage());
    }
}
