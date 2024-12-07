/*
package com.digisphere.FurnitureCustomizationService.application.command;

import com.digisphere.FurnitureCustomizationService.application.facadePattern.IProcessOrder;
import com.digisphere.FurnitureCustomizationService.application.useCase.IUseCase;
import com.digisphere.FurnitureCustomizationService.application.utils.RequestValidator;

import java.util.List;
import java.util.Map;

public class ChairCommand implements AbstractCommand {
    private IUseCase useCase;
    private Map<String, String> params;
    private final IProcessOrder directorsFacade;
    private final List<String> FIELDS = List.of("creatorsId", "material", "upholstery", "adjustableHeight", "armrests", "seatRotation", "maximumWeightSupport", "legStyle", "seatAndFrameColor", "purpose");

    public ChairCommand(IProcessOrder directorsFacade) {
        this.directorsFacade = directorsFacade;
    }

    public void setUseCase() {
        this.useCase = new CreateChairOrder(directorsFacade);
    }

    @Override
    public void setParams(Map<String, String> params) {
        RequestValidator.validateRequestFields(params, FIELDS);
        this.params = params;
    }

    @Override
    public String execute() {
        setUseCase();
        return useCase.execute(params);
    }
}
*/
