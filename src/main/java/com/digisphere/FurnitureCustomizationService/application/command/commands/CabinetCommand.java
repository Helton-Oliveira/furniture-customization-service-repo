package com.digisphere.FurnitureCustomizationService.application.command.commands;

import com.digisphere.FurnitureCustomizationService.application.useCase.IProcessOrder;

import java.util.List;
import java.util.Map;

public class CabinetCommand extends AbstractCommand{
    public CabinetCommand(IProcessOrder processOrder, Map<String, String> req) {
        super(processOrder, req);
    }

    @Override
    public String execute() {
        validateRequestFields(requiredFields());
        return processOrder.execute(req);
    }

    @Override
    protected List<String> requiredFields() {
        DEFAULT_FIELDS.add("numberOfDoors");
        DEFAULT_FIELDS.add("doorType");
        DEFAULT_FIELDS.add("numberOfDrawers");
        DEFAULT_FIELDS.add("closingSystem");
        DEFAULT_FIELDS.add("internalDividers");
        DEFAULT_FIELDS.add("finish");
        DEFAULT_FIELDS.add("typeOfHandles");
        DEFAULT_FIELDS.add("internalAndExternalColor");
        DEFAULT_FIELDS.add("montage");
        DEFAULT_FIELDS.add("width");
        DEFAULT_FIELDS.add("height");
        DEFAULT_FIELDS.add("depth");

        return DEFAULT_FIELDS;
    }

}
