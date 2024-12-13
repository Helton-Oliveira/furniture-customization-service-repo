package com.digisphere.FurnitureCustomizationService.application.directors;

import com.digisphere.FurnitureCustomizationService.application.domain.cabinet.cabinetBuilder.CabinetBuilder;
import com.digisphere.FurnitureCustomizationService.application.domain.cabinet.cabinetBuilder.ICabinetBuilder;

import java.util.Map;
import java.util.UUID;

public class CabinetDirector implements IDirector {

    private final ICabinetBuilder builder = new CabinetBuilder();

    @Override
    public <T> T create(Map<String, String> data) {
        builder.setId(UUID.randomUUID());
        builder.setCreatorsCpf(data.get("creatorsCpf"));
        builder.setMaterial(UUID.fromString(data.get("materialId")));
        builder.setNumberOfDoors(data.get("numberOfDoors"));
        builder.setDoorType(data.get("doorType"));
        builder.setNumberOfDrawers(data.get("numberOfDrawers"));
        builder.setClosingSystem(data.get("closingSystem"));
        builder.setInternalDividers(data.get("internalDividers"));
        builder.setFinish(data.get("finish"));
        builder.setTypeOfHandles(data.get("typeOfHandles"));
        builder.setInternalAndExternalColor(data.get("internalAndExternalColor"));
        builder.setMontage(data.get("montage"));
        builder.setPurpose(data.get("purpose"));
        builder.setDimensions(Map.of(
                "width", data.get("width"),
                "height", data.get("height"),
                "depth", data.get("depth")
        ));
        return (T) builder.build();
    }
}
