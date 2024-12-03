package com.digisphere.FurnitureCustomizationService.application.cabinet.cabinetBuilder;

import com.digisphere.FurnitureCustomizationService.application.cabinet.domain.Cabinet;

import java.util.Map;
import java.util.UUID;

public interface ICabinetBuilder {
    Cabinet build();
    void reset();
    void setId(UUID id);
    void setCreatorsId(UUID creatorsId);
    void setMaterial(String material);
    void setNumberOfDoors(String numberOfDoors);
    void setDoorType(String doorType);
    void setNumberOfDrawers(String numberOfDrawers);
    void setClosingSystem(String closingSystem);
    void setInternalDividers(String internalDividers);
    void setFinish(String finish);
    void setTypeOfHandles(String typeOfHandles);
    void setInternalAndExternalColor(String internalAndExternalColor);
    void setDimensions(Map<String, String> dimensions);
    void setMontage(String montage);
    void setPurpose(String purpose);
}
