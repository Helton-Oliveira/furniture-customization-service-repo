package com.digisphere.FurnitureCustomizationService.application.table.tableBuilder;

import com.digisphere.FurnitureCustomizationService.application.table.domain.Table;

import java.util.Map;
import java.util.UUID;

public class TableDirector implements ITableDirector {
    private final ITableBuilder builder = new TableBuilder();

    @Override
    public Table createTable(Map<String, String> data) {
        builder.setId(UUID.randomUUID());
        builder.setCreatorsCpf(data.get("creatorsCpf"));
        builder.setMaterial(data.get("materials"));
        builder.setFrameMaterial(data.get("frameMaterial"));
        builder.setFormat(data.get("format"));
        builder.setNumberOfFeet(data.get("numberOfFeet"));
        builder.setMontage(data.get("montage"));
        builder.setPurpose(data.get("purpose"));
        builder.setDimensions(Map.of(
                "length", data.get("length"),
                "width", data.get("width"),
                "height", data.get("height")
        ));
        return builder.build();
    }
}
