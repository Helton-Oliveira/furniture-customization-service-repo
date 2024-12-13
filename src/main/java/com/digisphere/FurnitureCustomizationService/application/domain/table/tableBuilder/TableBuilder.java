package com.digisphere.FurnitureCustomizationService.application.domain.table.tableBuilder;

import com.digisphere.FurnitureCustomizationService.application.domain.table.domain.Table;

import java.util.Map;
import java.util.UUID;

public class TableBuilder implements ITableBuilder {
    private Table table = new Table();

    @Override
    public Table build() {
        var tableInstance = this.table;
        reset();
        return tableInstance;
    }

    @Override
    public void reset() {
        this.table = new Table();
    }

    @Override
    public void setId(UUID id) {
        this.table.setId(id);
    }

    @Override
    public void setCreatorsCpf(String creatorsCpf) {
        this.table.setCreatorsCpf(creatorsCpf);
    }

    @Override
    public void setMaterialId(UUID materialId) {
        this.table.setMaterialId(materialId);
    }

    @Override
    public void setFrameMaterial(String frameMaterial) {
        this.table.setFrameMaterial(frameMaterial);
    }

    @Override
    public void setFormat(String format) {
        this.table.setFormat(format);
    }

    @Override
    public void setDimensions(Map<String, String> dimensions) {
        this.table.setDimensions(dimensions);
    }

    @Override
    public void setNumberOfFeet(String numberOfFeet) {
        this.table.setNumberOfFeet(numberOfFeet);
    }

    @Override
    public void setMontage(String montage) {
        this.table.setMontage(montage);
    }

    @Override
    public void setPurpose(String purpose) {
        this.table.setPurpose(purpose);
    }
}
