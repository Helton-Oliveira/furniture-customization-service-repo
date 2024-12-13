package com.digisphere.FurnitureCustomizationService.application.domain.chair.domain;

import java.util.UUID;

public class Chair {
    private UUID id;
    private String creatorsCpf;
    private UUID materialId;
    private String upholstery;
    private Boolean adjustableHeight;
    private Boolean armrests;
    private Boolean seatRotation;
    private String maximumWeightSupport;
    private String legStyle;
    private String seatAndFrameColor;
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

    public void setMaterial(UUID material) {
        this.materialId = material;
    }

    public String getUpholstery() {
        return upholstery;
    }

    public void setUpholstery(String upholstery) {
        this.upholstery = upholstery;
    }

    public Boolean getAdjustableHeight() {
        return adjustableHeight;
    }

    public void setAdjustableHeight(Boolean adjustableHeight) {
        this.adjustableHeight = adjustableHeight;
    }

    public Boolean getArmrests() {
        return armrests;
    }

    public void setArmrests(Boolean armrests) {
        this.armrests = armrests;
    }

    public Boolean getSeatRotation() {
        return seatRotation;
    }

    public void setSeatRotation(Boolean seatRotation) {
        this.seatRotation = seatRotation;
    }

    public String getMaximumWeightSupport() {
        return maximumWeightSupport;
    }

    public void setMaximumWeightSupport(String maximumWeightSupport) {
        this.maximumWeightSupport = maximumWeightSupport;
    }

    public String getLegStyle() {
        return legStyle;
    }

    public void setLegStyle(String legStyle) {
        this.legStyle = legStyle;
    }

    public String getSeatAndFrameColor() {
        return seatAndFrameColor;
    }

    public void setSeatAndFrameColor(String seatAndFrameColor) {
        this.seatAndFrameColor = seatAndFrameColor;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
