package com.digisphere.FurnitureCustomizationService.application.command;

import com.digisphere.FurnitureCustomizationService.application.facadePattern.IProcessOrder;

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
        processOrder.validateFields(fields, req);
    }

    abstract String execute();
}
