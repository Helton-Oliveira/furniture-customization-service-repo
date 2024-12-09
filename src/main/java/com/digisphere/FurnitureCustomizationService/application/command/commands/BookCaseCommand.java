package com.digisphere.FurnitureCustomizationService.application.command.commands;

import com.digisphere.FurnitureCustomizationService.application.useCase.IProcessOrder;

import java.util.List;
import java.util.Map;

public class BookCaseCommand extends AbstractCommand{

    public BookCaseCommand(IProcessOrder processOrder, Map<String, String> req) {
        super(processOrder, req);
    }

    @Override
    public String execute() {
        validateRequestFields(requiredFields());
        return processOrder.execute(req);
    }

    @Override
    protected List<String> requiredFields() {
        DEFAULT_FIELDS.add("numberOfShelves");
        DEFAULT_FIELDS.add("heightBetweenShelves");
        DEFAULT_FIELDS.add("mouthingSystem");
        DEFAULT_FIELDS.add("width");
        DEFAULT_FIELDS.add("height");
        DEFAULT_FIELDS.add("depth");
        DEFAULT_FIELDS.add("externalFinish");
        DEFAULT_FIELDS.add("weightSupportedPerShelf");
        DEFAULT_FIELDS.add("style");

        return DEFAULT_FIELDS;
    }
}
