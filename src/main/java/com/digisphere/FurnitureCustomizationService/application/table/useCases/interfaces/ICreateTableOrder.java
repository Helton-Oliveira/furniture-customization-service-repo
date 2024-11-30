package com.digisphere.FurnitureCustomizationService.application.table.useCases.interfaces;

import com.digisphere.FurnitureCustomizationService.application.table.domain.Table;

import java.util.Map;

public interface ICreateTableOrder {
    Table execute(Map<String, String> data);
}
