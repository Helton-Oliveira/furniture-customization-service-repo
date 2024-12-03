package com.digisphere.FurnitureCustomizationService.application.table.useCases;

import com.digisphere.FurnitureCustomizationService.application.facadePattern.IDirectorsFacade;
import com.digisphere.FurnitureCustomizationService.application.table.domain.Table;
import com.digisphere.FurnitureCustomizationService.application.table.useCases.interfaces.ICreateTableOrder;

import java.util.Map;

public class CreateTableOrder implements ICreateTableOrder {
    private final IDirectorsFacade directorsFacade;

    public CreateTableOrder(IDirectorsFacade directorsFacade) {
        this.directorsFacade = directorsFacade;
    }

    @Override
    public Table execute(Map<String, String> data) {
        return directorsFacade.createTable(data);
    }
}
