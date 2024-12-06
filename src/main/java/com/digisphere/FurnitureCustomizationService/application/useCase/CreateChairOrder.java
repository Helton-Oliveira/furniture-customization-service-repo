package com.digisphere.FurnitureCustomizationService.application.useCase;

import com.digisphere.FurnitureCustomizationService.application.facadePattern.IDirectorsFacade;

import java.util.Map;

public class CreateChairOrder implements IUseCase {
    private final IDirectorsFacade directorsFacade;

    public CreateChairOrder(IDirectorsFacade directorsFacade1) {
        this.directorsFacade = directorsFacade1;
    }

    @Override
    public String execute(Map<String, String> reqParams) {

        return "";
    }
}
