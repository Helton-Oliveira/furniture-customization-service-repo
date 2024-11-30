package com.digisphere.FurnitureCustomizationService.application.table.useCases;

import com.digisphere.FurnitureCustomizationService.application.table.domain.Table;
import com.digisphere.FurnitureCustomizationService.application.table.tableBuilder.ITableDirector;
import com.digisphere.FurnitureCustomizationService.application.table.useCases.interfaces.ICreateTableOrder;

import java.util.Map;

public class CreateTableOrder implements ICreateTableOrder {
    private final ITableDirector tableDirector;

    public CreateTableOrder(ITableDirector tableDirector) {
        this.tableDirector = tableDirector;
    }

    @Override
    public Table execute(Map<String, String> data) {
        return tableDirector.createTable(data);
    }
}
