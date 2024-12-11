package com.digisphere.FurnitureCustomizationService.infra;

import java.util.Map;

public class MaterialsMock { // classe criada com intuito de fornecer dados de materiais fake para a testabilidade e construção do sistema
    private static final Map<String, Double> MATERIALS = Map.of(
            "lightWood", 60.0,
            "darkWood", 70.90,
            "wideGrainWood", 64.90,
            "embossedWood", 76.0,
            "plainGlass", 36.0,
            "sandBlastedGlass", 41.80
    );

    public static void materialsExists(String material) {
        if(!MATERIALS.containsKey(material)) throw new RuntimeException("ERRO! MATERIAL INEXISTENTE");
    }

}
