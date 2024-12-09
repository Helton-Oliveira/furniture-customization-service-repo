package com.digisphere.FurnitureCustomizationService.application.directors;

import com.digisphere.FurnitureCustomizationService.application.domain.bookcase.bookcaseBuilder.BookCaseBuilder;
import com.digisphere.FurnitureCustomizationService.application.domain.bookcase.bookcaseBuilder.IBookCaseBuilder;

import java.util.Map;
import java.util.UUID;

public class BookCaseDirector implements IDirector {
    private IBookCaseBuilder builder = new BookCaseBuilder();

    @Override
    public <T> T create(Map<String, String> data) {
        builder.setId(UUID.randomUUID());
        builder.setCreatorsId(UUID.fromString(data.get("creatorsId")));
        builder.setMaterial(data.get("material"));
        builder.setNumberOfShelves(data.get("numberOfShelves"));
        builder.setHeightBetweenShelves(data.get("heightBetweenShelves"));
        builder.setMouthingSystem(data.get("mouthingSystem"));

        Map<String, String> dimensions = Map.of(
                "width", data.get("width"),
                "height", data.get("height"),
                "depth", data.get("depth")
        );
        builder.setDimensions(dimensions);

        builder.setExternalFinish(data.get("externalFinish"));
        builder.setWeightSupportedPerShelf(data.get("weightSupportedPerShelf"));
        builder.setStyle(data.get("style"));

        return (T) builder.build();
    }
}
