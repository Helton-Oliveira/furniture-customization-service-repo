package com.digisphere.FurnitureCustomizationService.infra.chainOfResponsability;

import java.util.List;
import java.util.Map;

public class MaterialValidationHandler extends BaseRequestHandler {
    private final Map<String, Double> MATERIALS = Map.of(
            "lightWood", 60.0,
            "darkWood", 70.90,
            "wideGrainWood", 64.90,
            "embossedWood", 76.0,
            "plainGlass", 36.0,
            "sandBlastedGlass", 41.80
    );

    @Override
    public void valid(Map<String, String> fields, List<String> keys) {
        if(!MATERIALS.containsKey(fields.get("material"))) throw new RuntimeException("ERRO! MATERIAL INEXISTENTE");
    }
}
