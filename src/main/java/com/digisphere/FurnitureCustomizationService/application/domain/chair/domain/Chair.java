package com.digisphere.FurnitureCustomizationService.application.domain.chair.domain;

import java.util.UUID;

public class Chair {
    private UUID id;
    private UUID creatorsId;
    private String material;
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

    public UUID getCreatorsId() {
        return creatorsId;
    }

    public void setCreatorsId(UUID creatorsId) {
        this.creatorsId = creatorsId;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
