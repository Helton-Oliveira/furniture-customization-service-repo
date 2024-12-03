package com.digisphere.FurnitureCustomizationService.application.cabinet.cabinetBuilder;

import com.digisphere.FurnitureCustomizationService.application.cabinet.domain.Cabinet;

import java.util.Map;

public interface ICabinetDirector {
    Cabinet createCloset(Map<String, String> data);
}
