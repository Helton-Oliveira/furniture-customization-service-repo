package com.digisphere.FurnitureCustomizationService.application.domain.table.tableBuilder;

import com.digisphere.FurnitureCustomizationService.application.domain.table.domain.Table;

import java.util.Map;
import java.util.UUID;

public interface ITableBuilder {
    Table build();
    void reset();
    void setId(UUID id);
    void setCreatorsCpf(String creatorsCpf);
    void setMaterial(String material);
    void setFrameMaterial(String frameMaterial);
    void setFormat(String format);
    void setDimensions(Map<String, String> dimensions);
    void setNumberOfFeet(String numberOfFeet);
    void setMontage(String montage);
    void setPurpose(String purpose);
}
