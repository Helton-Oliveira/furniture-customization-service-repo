package com.digisphere.FurnitureCustomizationService.infra.errorHandler;

public class CustomError extends RuntimeException {
    public CustomError(String message) {
        super(message);
    }
}
