package com.digisphere.FurnitureCustomizationService.application.domain.bookcase.bookcaseBuilder;

import com.digisphere.FurnitureCustomizationService.application.domain.bookcase.domain.BookCase;

import java.util.Map;
import java.util.UUID;

public class BookCaseBuilder implements IBookCaseBuilder {
    private BookCase bookCase = new BookCase();

    @Override
    public BookCase build() {
        BookCase builtBookCase = this.bookCase;
        this.reset();
        return builtBookCase;
    }

    @Override
    public void reset() {
        this.bookCase = new BookCase();
    }

    @Override
    public void setId(UUID id) {
        this.bookCase.setId(id);
    }

    @Override
    public void setCreatorsId(UUID creatorsId) {
        this.bookCase.setCreatorsId(creatorsId);
    }

    @Override
    public void setMaterial(String material) {
        this.bookCase.setMaterial(material);
    }

    @Override
    public void setNumberOfShelves(String numberOfShelves) {
        this.bookCase.setNumberOfShelves(numberOfShelves);
    }

    @Override
    public void setHeightBetweenShelves(String heightBetweenShelves) {
        this.bookCase.setHeightBetweenShelves(heightBetweenShelves);
    }

    @Override
    public void setMouthingSystem(String mouthingSystem) {
        this.bookCase.setMouthingSystem(mouthingSystem);
    }

    @Override
    public void setDimensions(Map<String, String> dimensions) {
        this.bookCase.setDimensions(dimensions);
    }

    @Override
    public void setExternalFinish(String externalFinish) {
        this.bookCase.setExternalFinish(externalFinish);
    }

    @Override
    public void setWeightSupportedPerShelf(String weightSupportedPerShelf) {
        this.bookCase.setWeightSupportedPerShelf(weightSupportedPerShelf);
    }

    @Override
    public void setStyle(String style) {
        this.bookCase.setStyle(style);
    }

    @Override
    public void setPurpose(String purpose) {
        this.bookCase.setPurpose(purpose);
    }
}
