package com.digisphere.FurnitureCustomizationService.application.domain.chair.chairBuilder;

import com.digisphere.FurnitureCustomizationService.application.domain.chair.domain.Chair;

import java.util.UUID;

public interface IChairBuilder {
    Chair build();
    void reset();
    void setId(UUID id);
    void setCreatorsCpf(String creatorsCpf);
    void setMaterial(UUID materialId);
    void setUpholstery(String upholstery);
    void setAdjustableHeight(Boolean adjustableHeight);
    void setArmrests(Boolean armrests);
    void setSeatRotation(Boolean seatRotation);
    void setMaximumWeightSupport(String maximumWeightSupport);
    void setLegStyle(String legStyle);
    void setSeatAndFrameColor(String seatAndFrameColor);
    void setPurpose(String purpose);
}
