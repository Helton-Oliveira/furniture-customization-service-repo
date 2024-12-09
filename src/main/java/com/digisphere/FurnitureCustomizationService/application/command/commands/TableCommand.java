package com.digisphere.FurnitureCustomizationService.application.command.commands;

import com.digisphere.FurnitureCustomizationService.application.useCase.IProcessOrder;

import java.util.List;
import java.util.Map;

public class TableCommand extends AbstractCommand {
    public TableCommand(IProcessOrder directorsFacade, Map<String, String> req) {
        super(directorsFacade, req);
    }

    @Override
    public String execute() {
        validateRequestFields(requiredFields());
        return processOrder.execute(req);
    }

    @Override
    protected List<String> requiredFields() {
        DEFAULT_FIELDS.add("frameMaterial");
        DEFAULT_FIELDS.add("format");
        DEFAULT_FIELDS.add("width");
        DEFAULT_FIELDS.add("length");
        DEFAULT_FIELDS.add("height");
        DEFAULT_FIELDS.add("numberOfFeet");
        DEFAULT_FIELDS.add("montage");

        return DEFAULT_FIELDS;
    }

}
