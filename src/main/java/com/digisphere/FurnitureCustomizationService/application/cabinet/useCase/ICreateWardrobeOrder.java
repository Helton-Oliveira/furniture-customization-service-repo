package com.digisphere.FurnitureCustomizationService.application.cabinet.useCase;

import com.digisphere.FurnitureCustomizationService.application.cabinet.domain.Cabinet;

import java.util.Map;

public interface ICreateWardrobeOrder {
    Cabinet execute(Map<String, String> data);
}
