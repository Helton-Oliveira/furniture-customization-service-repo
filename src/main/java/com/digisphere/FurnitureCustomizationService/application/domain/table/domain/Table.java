package com.digisphere.FurnitureCustomizationService.application.domain.table.domain;

import java.util.Map;
import java.util.UUID;

public class Table {
    private UUID id;
    private String creatorsCpf;
    private UUID materialId;
    private String frameMaterial;
    private String format;
    private Map<String, String> dimensions;
    private String numberOfFeet;
    private String montage;
    private String purpose;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCreatorsCpf() {
        return creatorsCpf;
    }

    public void setCreatorsCpf(String creatorsCpf) {
        this.creatorsCpf = creatorsCpf;
    }

    public UUID getMaterialId() {
        return materialId;
    }

    public void setMaterialId(UUID materialId) {
        this.materialId = materialId;
    }

    public String getFrameMaterial() {
        return frameMaterial;
    }

    public void setFrameMaterial(String frameMaterial) {
        this.frameMaterial = frameMaterial;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Map<String, String> getDimensions() {
        return dimensions;
    }

    public void setDimensions(Map<String, String> dimensions) {
        this.dimensions = dimensions;
    }

    public String getNumberOfFeet() {
        return numberOfFeet;
    }

    public void setNumberOfFeet(String numberOfFeet) {
        this.numberOfFeet = numberOfFeet;
    }

    public String getMontage() {
        return montage;
    }

    public void setMontage(String montage) {
        this.montage = montage;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
