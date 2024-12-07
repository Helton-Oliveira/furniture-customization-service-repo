package com.digisphere.FurnitureCustomizationService.application.command;

import com.digisphere.FurnitureCustomizationService.application.facadePattern.IProcessOrder;

import java.util.List;
import java.util.Map;

public class TableCommand extends AbstractCommand {
    private final List<String> FIELDS = List.of("creatorsId", "material", "frameMaterial", "format", "width", "length", "height", "numberOfFeet", "montage", "purpose", "price", "quantity");

    public TableCommand(IProcessOrder directorsFacade, Map<String, String> req) {
        super(directorsFacade, req);
    }

    @Override
    String execute() {
        validateRequestFields(FIELDS);
        return processOrder.process(req);
    }


}
