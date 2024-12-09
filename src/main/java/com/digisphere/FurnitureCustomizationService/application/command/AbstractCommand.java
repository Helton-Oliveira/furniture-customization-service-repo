package com.digisphere.FurnitureCustomizationService.application.command;

import com.digisphere.FurnitureCustomizationService.application.useCase.IProcessOrder;
import com.digisphere.FurnitureCustomizationService.application.utils.RequestValidator;

import java.util.List;
import java.util.Map;

public abstract class AbstractCommand {
    protected final IProcessOrder processOrder;
    protected final Map<String, String> req;

    public AbstractCommand(IProcessOrder processOrder, Map<String, String> req) {
        this.processOrder = processOrder;
        this.req = req;
    }

    protected void validateRequestFields(List<String> fields) {
        RequestValidator.validateRequestFields(req, fields);
    }

    abstract String execute();
}
