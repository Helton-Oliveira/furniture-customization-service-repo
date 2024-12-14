package com.digisphere.FurnitureCustomizationService.infra.chainOfResponsability;

import com.digisphere.FurnitureCustomizationService.infra.errorHandler.CustomError;

import java.util.List;
import java.util.Map;

public class MaterialValidationHandler extends BaseRequestHandler {
    private final Map<String, String> MATERIALS = Map.of(
            "40f83189-0a88-48e1-9e7b-730794aac0c5", "lightWood",
             "90c90e26-2e40-42b5-bb83-5d9aefe9ccb5","darkWood",
            "1250cfaa-5b81-486d-9019-ba4b6d175da5","wideGrainWood",
             "252a47b9-8df8-42a1-bfd8-a772b2de28f7","embossedWood",
            "3f3fc3d2-f2ef-4beb-8176-3441ab63c897","plainGlass",
             "953e773e-6d87-430a-9b4c-2a85fb5192e2","sandBlastedGlass"
    );

    @Override
    public void valid(Map<String, String> fields, List<String> keys) {
        if(!MATERIALS.containsValue(fields.get("material"))) throw new CustomError("ERRO! MATERIAL INEXISTENTE");
    }
}
