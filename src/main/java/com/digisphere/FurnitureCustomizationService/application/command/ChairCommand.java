package com.digisphere.FurnitureCustomizationService.application.command;

import com.digisphere.FurnitureCustomizationService.application.facadePattern.IDirectorsFacade;
import com.digisphere.FurnitureCustomizationService.application.useCase.CreateChairOrder;
import com.digisphere.FurnitureCustomizationService.application.useCase.IUseCase;
import com.digisphere.FurnitureCustomizationService.application.utils.RequestValidator;

import java.util.List;
import java.util.Map;

public class ChairCommand implements ICommand{
    private IUseCase useCase;
    private final Map<String, String> params;
    private final List<String> FIELDS = List.of("creatorsId", "material", "upholstery", "adjustableHeight", "armrests", "seatRotation", "maximumWeightSupport", "legStyle", "seatAndFrameColor", "purpose");

    public ChairCommand(IDirectorsFacade directorsFacade, Map<String, String> params) {
        RequestValidator.validateRequestFields(params ,FIELDS);
        setUseCase(directorsFacade);
        this.params = params;
    }

    public void setUseCase(IDirectorsFacade directorsFacade) {
        this.useCase = new CreateChairOrder(directorsFacade);
    }

    @Override
    public String execute() {
        return useCase.execute(params);
    }
}
