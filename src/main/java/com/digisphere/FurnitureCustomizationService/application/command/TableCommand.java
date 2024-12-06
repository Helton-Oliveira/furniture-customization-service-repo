package com.digisphere.FurnitureCustomizationService.application.command;

import com.digisphere.FurnitureCustomizationService.application.facadePattern.IDirectorsFacade;
import com.digisphere.FurnitureCustomizationService.application.useCase.CreateTableOrder;
import com.digisphere.FurnitureCustomizationService.application.useCase.IUseCase;
import com.digisphere.FurnitureCustomizationService.application.utils.RequestValidator;

import java.util.List;
import java.util.Map;

public class TableCommand implements ICommand{
    private IUseCase useCase;
    private final Map<String, String> params;
    private final List<String> FIELDS = List.of("creatorsId", "material", "frameMaterial", "format", "width", "length", "height", "numberOfFeet", "montage", "purpose", "price", "quantity");

    public TableCommand(Map<String, String> params, IDirectorsFacade directorsFacade) {
        RequestValidator.validateRequestFields(params, FIELDS);
        this.setUseCase(directorsFacade);
        this.params = params;
    }

    private void setUseCase(IDirectorsFacade directorsFacade) {
        this.useCase = new CreateTableOrder(directorsFacade);
    }

    @Override
    public String execute() {
        return useCase.execute(params);
    }

}
