package com.digisphere.FurnitureCustomizationService.application.command;

import com.digisphere.FurnitureCustomizationService.application.facadePattern.IDirectorsFacade;
import com.digisphere.FurnitureCustomizationService.application.useCase.CreateTableOrder;
import com.digisphere.FurnitureCustomizationService.application.useCase.IUseCase;
import com.digisphere.FurnitureCustomizationService.application.utils.RequestValidator;

import java.util.List;
import java.util.Map;

public class TableCommand implements ICommand{
    private IUseCase useCase;
    private Map<String, String> params;
    private final IDirectorsFacade directorsFacade;
    private final List<String> FIELDS = List.of("creatorsId", "material", "frameMaterial", "format", "width", "length", "height", "numberOfFeet", "montage", "purpose", "price", "quantity");

    public TableCommand(IDirectorsFacade directorsFacade) {
        this.directorsFacade = directorsFacade;
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

    private void setUseCase() {
        this.useCase = new CreateTableOrder(directorsFacade);
    }
}
