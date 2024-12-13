package com.digisphere.FurnitureCustomizationService.application.domain.cabinet.cabinetBuilder;

import com.digisphere.FurnitureCustomizationService.application.domain.cabinet.domain.Cabinet;

import java.util.Map;
import java.util.UUID;

public class CabinetBuilder implements ICabinetBuilder {

    private Cabinet cabinet = new Cabinet();


    @Override
    public Cabinet build() {
        Cabinet cabinetInstance = this.cabinet;
        reset();
        return cabinetInstance;
    }

    @Override
    public void reset() {
        this.cabinet = new Cabinet();
    }

    @Override
    public void setId(UUID id) {
        this.cabinet.setId(id);
    }

    @Override
    public void setCreatorsCpf(String creatorsCpf) {
        this.cabinet.setCreatorsCpf(creatorsCpf);
    }

    @Override
    public void setMaterial(UUID materialId) {
        this.cabinet.setMaterialId(materialId);
    }

    @Override
    public void setNumberOfDoors(String numberOfDoors) {
        this.cabinet.setNumberOfDoors(numberOfDoors);
    }

    @Override
    public void setDoorType(String doorType) {
        this.cabinet.setDoorType(doorType);
    }

    @Override
    public void setNumberOfDrawers(String numberOfDrawers) {
        this.cabinet.setNumberOfDrawers(numberOfDrawers);
    }

    @Override
    public void setClosingSystem(String closingSystem) {
        this.cabinet.setClosingSystem(closingSystem);
    }

    @Override
    public void setInternalDividers(String internalDividers) {
        this.cabinet.setInternalDividers(internalDividers);
    }

    @Override
    public void setFinish(String finish) {
        this.cabinet.setFinish(finish);
    }

    @Override
    public void setTypeOfHandles(String typeOfHandles) {
        this.cabinet.setTypeOfHandles(typeOfHandles);
    }

    @Override
    public void setInternalAndExternalColor(String internalAndExternalColor) {
        this.cabinet.setInternalAndExternalColor(internalAndExternalColor);
    }

    @Override
    public void setDimensions(Map<String, String> dimensions) {
        this.cabinet.setDimensions(dimensions);
    }

    @Override
    public void setMontage(String montage) {
        this.cabinet.setMontage(montage);
    }

    @Override
    public void setPurpose(String purpose) {
        this.cabinet.setPurpose(purpose);
    }

}
