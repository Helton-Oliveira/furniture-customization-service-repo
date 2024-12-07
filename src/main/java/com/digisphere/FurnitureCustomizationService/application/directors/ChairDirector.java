package com.digisphere.FurnitureCustomizationService.application.directors;

import com.digisphere.FurnitureCustomizationService.application.chair.chairBuilder.ChairBuilder;
import com.digisphere.FurnitureCustomizationService.application.chair.chairBuilder.IChairBuilder;

import java.util.Map;
import java.util.UUID;

public class ChairDirector implements IDirector{
    private final IChairBuilder builder = new ChairBuilder();

    @Override
    public <T> T create(Map<String, String> data) {
        builder.setId(UUID.randomUUID());
        builder.setCreatorsId(UUID.fromString(data.get("creatorsId")));
        builder.setMaterial(data.get("material"));
        builder.setUpholstery(data.get("upholstery"));
        builder.setAdjustableHeight(Boolean.parseBoolean(data.get("adjustableHeight")));
        builder.setArmrests(Boolean.parseBoolean(data.get("armrests")));
        builder.setSeatRotation(Boolean.parseBoolean(data.get("seatRotation")));
        builder.setMaximumWeightSupport(data.get("maximumWeightSupport"));
        builder.setLegStyle(data.get("legStyle"));
        builder.setSeatAndFrameColor(data.get("seatAndFrameColor"));
        builder.setPurpose(data.get("purpose"));
        return (T) builder.build();
    }
}
