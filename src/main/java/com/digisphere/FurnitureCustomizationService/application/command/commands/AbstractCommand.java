package com.digisphere.FurnitureCustomizationService.application.command.commands;

import com.digisphere.FurnitureCustomizationService.application.useCase.IProcessOrder;
import com.digisphere.FurnitureCustomizationService.infra.chainOfResponsability.BaseRequestHandler;
import com.digisphere.FurnitureCustomizationService.infra.chainOfResponsability.IRequestHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class AbstractCommand {
    protected final IProcessOrder processOrder;
    protected final Map<String, String> req;
    protected List<String> DEFAULT_FIELDS = new ArrayList<>(List.of("material", "category", "creatorsId", "quantity", "price", "purpose"));
    private final IRequestHandler REQUEST_HANDLER = new BaseRequestHandler();

    public AbstractCommand(IProcessOrder processOrder, Map<String, String> req) {
        this.processOrder = processOrder;
        this.req = req;
    }

    protected void validateRequestFields(List<String> fields) {
        REQUEST_HANDLER.valid(req, fields);
    }

    public abstract String execute();
    protected abstract List<String> requiredFields();
}
