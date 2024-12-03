package com.digisphere.FurnitureCustomizationService.application.cabinet.useCase;

import com.digisphere.FurnitureCustomizationService.application.cabinet.cabinetBuilder.ICabinetDirector;
import com.digisphere.FurnitureCustomizationService.application.cabinet.domain.Cabinet;

import java.util.Map;

public class CreateWardrobeOrder implements ICreateWardrobeOrder{
    private final ICabinetDirector director;

    public CreateWardrobeOrder(ICabinetDirector director) {
        this.director = director;
    }

    @Override
    public Cabinet execute(Map<String, String> data) {
        return director.createCloset(data);
    }
}
