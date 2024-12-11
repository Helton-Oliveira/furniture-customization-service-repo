package com.digisphere.FurnitureCustomizationService.application.domain.bookcase.bookcaseBuilder;

import com.digisphere.FurnitureCustomizationService.application.domain.bookcase.domain.BookCase;

import java.util.Map;
import java.util.UUID;

public interface IBookCaseBuilder {
    BookCase build();
    void reset();
    void setId(UUID id);
    void setCreatorsId(UUID creatorsId);
    void setMaterial(String material);
    void setNumberOfShelves(String numberOfShelves);
    void setHeightBetweenShelves(String heightBetweenShelves);
    void setMouthingSystem(String mouthingSystem);
    void setDimensions(Map<String, String> dimensions);
    void setExternalFinish(String externalFinish);
    void setWeightSupportedPerShelf(String weightSupportedPerShelf);
    void setStyle(String style);
    void setPurpose(String purpose);
}
