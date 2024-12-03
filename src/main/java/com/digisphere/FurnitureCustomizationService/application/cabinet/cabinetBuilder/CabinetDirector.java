package com.digisphere.FurnitureCustomizationService.application.cabinet.cabinetBuilder;

import com.digisphere.FurnitureCustomizationService.application.cabinet.domain.Cabinet;

import java.util.Map;
import java.util.UUID;

public class CabinetDirector implements ICabinetDirector {

    private final ICabinetBuilder builder = new CabinetBuilder();

    @Override
    public Cabinet createCloset(Map<String, String> data) {
        builder.setId(UUID.randomUUID());
        builder.setCreatorsId(UUID.fromString(data.get("creatorsId")));
        builder.setMaterial(data.get("material"));
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
        return builder.build();
    }
}
