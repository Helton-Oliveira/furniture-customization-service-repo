package com.digisphere.FurnitureCustomizationService.application.command.commands;

import com.digisphere.FurnitureCustomizationService.application.useCase.IProcessOrder;

import java.util.List;
import java.util.Map;

public class ChairCommand extends AbstractCommand {
    public ChairCommand(IProcessOrder processOrder, Map<String, String> req) {
        super(processOrder, req);
    }

    @Override
    public String execute() {
        validateRequestFields(requiredFields());
        return processOrder.execute(req);
    }

    @Override
    protected List<String> requiredFields() {
        DEFAULT_FIELDS.add("upholstery");
        DEFAULT_FIELDS.add("adjustableHeight");
        DEFAULT_FIELDS.add("armrests");
        DEFAULT_FIELDS.add("seatRotation");
        DEFAULT_FIELDS.add("maximumWeightSupport");
        DEFAULT_FIELDS.add("legStyle");
        DEFAULT_FIELDS.add("seatAndFrameColor");

        return DEFAULT_FIELDS;
    }


}
