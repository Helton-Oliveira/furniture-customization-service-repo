package com.digisphere.FurnitureCustomizationService.application.cabinet.domain;

import java.util.Map;
import java.util.UUID;

public class Cabinet {
    private UUID id;
    private UUID creatorsId;
    private String material;
    private String numberOfDoors;
    private String doorType;
    private String numberOfDrawers;
    private String ClosingSystem;
    private String internalDividers;
    private String finish;
    private String typeOfHandles;
    private String internalAndExternalColor;
    private Map<String, String> dimensions;
    private String montage;
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

    public String getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(String numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getDoorType() {
        return doorType;
    }

    public void setDoorType(String doorType) {
        this.doorType = doorType;
    }

    public String getNumberOfDrawers() {
        return numberOfDrawers;
    }

    public void setNumberOfDrawers(String numberOfDrawers) {
        this.numberOfDrawers = numberOfDrawers;
    }

    public String getClosingSystem() {
        return ClosingSystem;
    }

    public void setClosingSystem(String closingSystem) {
        ClosingSystem = closingSystem;
    }

    public String getInternalDividers() {
        return internalDividers;
    }

    public void setInternalDividers(String internalDividers) {
        this.internalDividers = internalDividers;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public String getTypeOfHandles() {
        return typeOfHandles;
    }

    public void setTypeOfHandles(String typeOfHandles) {
        this.typeOfHandles = typeOfHandles;
    }

    public String getInternalAndExternalColor() {
        return internalAndExternalColor;
    }

    public void setInternalAndExternalColor(String internalAndExternalColor) {
        this.internalAndExternalColor = internalAndExternalColor;
    }

    public Map<String, String> getDimensions() {
        return dimensions;
    }

    public void setDimensions(Map<String, String> dimensions) {
        this.dimensions = dimensions;
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
