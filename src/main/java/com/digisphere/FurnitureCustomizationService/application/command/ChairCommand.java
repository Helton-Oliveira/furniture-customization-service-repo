package com.digisphere.FurnitureCustomizationService.application.command;

import com.digisphere.FurnitureCustomizationService.application.useCase.IProcessOrder;

import java.util.List;
import java.util.Map;

public class ChairCommand extends AbstractCommand {
    private final List<String> FIELDS = List.of("creatorsId", "material", "upholstery", "adjustableHeight", "armrests", "seatRotation", "maximumWeightSupport", "legStyle", "seatAndFrameColor", "purpose");

    public ChairCommand(IProcessOrder processOrder, Map<String, String> req) {
        super(processOrder, req);
    };

    @Override
    String execute() {
        validateRequestFields(FIELDS);
        return processOrder.execute(req);
    }
}
