package com.digisphere.FurnitureCustomizationService.application.command;

import com.digisphere.FurnitureCustomizationService.application.facadePattern.IDirectorsFacade;
import com.digisphere.FurnitureCustomizationService.application.utils.RequestValidator;

import java.util.Map;

public class Invoker implements IInvoker {
    private ICommand command;

    @Override
    public void setParams(Map<String, String> params, IDirectorsFacade directorsFacade) {
        RequestValidator.validateFurnitureCategory(params);
        if(params.containsKey("category") && params.get("category").equalsIgnoreCase("table")) this.command = new TableCommand(params, directorsFacade);
        if(params.containsKey("category") && params.get("category").equalsIgnoreCase("chair")) this.command = new ChairCommand(directorsFacade, params);
    }

    @Override
    public String executeCommand() {
        return command.execute();
    }
}
