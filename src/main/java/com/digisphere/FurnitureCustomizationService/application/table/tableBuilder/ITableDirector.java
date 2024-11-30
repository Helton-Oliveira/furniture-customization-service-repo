package com.digisphere.FurnitureCustomizationService.application.table.tableBuilder;

import com.digisphere.FurnitureCustomizationService.application.table.domain.Table;

import java.util.Map;

public interface ITableDirector {
    Table createTable(Map<String, String> data);
}
