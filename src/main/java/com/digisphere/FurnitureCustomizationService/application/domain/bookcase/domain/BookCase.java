package com.digisphere.FurnitureCustomizationService.application.domain.bookcase.domain;

import java.util.Map;
import java.util.UUID;

public class BookCase {
    private UUID id;
    private UUID creatorsId;
    private String material;
    private String numberOfShelves;
    private String heightBetweenShelves;
    private String mouthingSystem;
    private Map<String, String> dimensions;
    private String externalFinish;
    private String weightSupportedPerShelf;
    private String style;
    private String purpose;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
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

    public String getNumberOfShelves() {
        return numberOfShelves;
    }

    public void setNumberOfShelves(String numberOfShelves) {
        this.numberOfShelves = numberOfShelves;
    }

    public String getHeightBetweenShelves() {
        return heightBetweenShelves;
    }

    public void setHeightBetweenShelves(String heightBetweenShelves) {
        this.heightBetweenShelves = heightBetweenShelves;
    }

    public String getMouthingSystem() {
        return mouthingSystem;
    }

    public void setMouthingSystem(String mouthingSystem) {
        this.mouthingSystem = mouthingSystem;
    }

    public Map<String, String> getDimensions() {
        return dimensions;
    }

    public void setDimensions(Map<String, String> dimensions) {
        this.dimensions = dimensions;
    }

    public String getExternalFinish() {
        return externalFinish;
    }

    public void setExternalFinish(String externalFinish) {
        this.externalFinish = externalFinish;
    }

    public String getWeightSupportedPerShelf() {
        return weightSupportedPerShelf;
    }

    public void setWeightSupportedPerShelf(String weightSupportedPerShelf) {
        this.weightSupportedPerShelf = weightSupportedPerShelf;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
