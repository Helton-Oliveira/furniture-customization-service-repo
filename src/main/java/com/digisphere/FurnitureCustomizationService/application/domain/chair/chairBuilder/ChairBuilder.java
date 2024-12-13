package com.digisphere.FurnitureCustomizationService.application.domain.chair.chairBuilder;

import com.digisphere.FurnitureCustomizationService.application.domain.chair.domain.Chair;

import java.util.UUID;

public class ChairBuilder implements IChairBuilder {
    private Chair chair = new Chair();

    @Override
    public Chair build() {
        Chair builtChair = this.chair;
        this.reset();
        return builtChair;
    }

    @Override
    public void reset() {
        this.chair = new Chair();
    }

    @Override
    public void setId(UUID id) {
        this.chair.setId(id);
    }

    @Override
    public void setCreatorsCpf(String creatorsCpf) {
        this.chair.setCreatorsCpf(creatorsCpf);
    }

    @Override
    public void setMaterial(UUID materialId) {
        this.chair.setMaterial(materialId);
    }

    @Override
    public void setUpholstery(String upholstery) {
        this.chair.setUpholstery(upholstery);
    }

    @Override
    public void setAdjustableHeight(Boolean adjustableHeight) {
        this.chair.setAdjustableHeight(adjustableHeight);
    }

    @Override
    public void setArmrests(Boolean armrests) {
        this.chair.setArmrests(armrests);
    }

    @Override
    public void setSeatRotation(Boolean seatRotation) {
        this.chair.setSeatRotation(seatRotation);
    }

    @Override
    public void setMaximumWeightSupport(String maximumWeightSupport) {
        this.chair.setMaximumWeightSupport(maximumWeightSupport);
    }

    @Override
    public void setLegStyle(String legStyle) {
        this.chair.setLegStyle(legStyle);
    }

    @Override
    public void setSeatAndFrameColor(String seatAndFrameColor) {
        this.chair.setSeatAndFrameColor(seatAndFrameColor);
    }

    @Override
    public void setPurpose(String purpose) {
        this.chair.setPurpose(purpose);
    }
}
