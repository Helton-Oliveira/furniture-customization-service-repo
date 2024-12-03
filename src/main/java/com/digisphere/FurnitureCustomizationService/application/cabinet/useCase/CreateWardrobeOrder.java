package com.digisphere.FurnitureCustomizationService.application.cabinet.useCase;

import com.digisphere.FurnitureCustomizationService.application.cabinet.domain.Cabinet;
import com.digisphere.FurnitureCustomizationService.application.facadePattern.IDirectorsFacade;

import java.util.Map;

public class CreateWardrobeOrder implements ICreateWardrobeOrder{
    private final IDirectorsFacade directors;

    public CreateWardrobeOrder(IDirectorsFacade directors) {
        this.directors = directors;
    }

    @Override
    public Cabinet execute(Map<String, String> data) {
        return directors.createCabinet(data);
    }
}
