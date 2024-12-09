package com.digisphere.FurnitureCustomizationService.CabinetTest;

import com.digisphere.FurnitureCustomizationService.application.directors.CabinetDirector;
import com.digisphere.FurnitureCustomizationService.application.cabinet.domain.Cabinet;
import com.digisphere.FurnitureCustomizationService.application.directors.IDirector;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class CabinetDirectorTest {

    @Test
    @DisplayName("Deve criar um armario")
    void createCabinet() {
        Map<String, String> data = new HashMap<>();
        data.put("creatorsId", UUID.randomUUID().toString());
        data.put("material", "Wood");
        data.put("numberOfDoors", "4");
        data.put("doorType", "Sliding");
        data.put("numberOfDrawers", "3");
        data.put("closingSystem", "Soft-close");
        data.put("internalDividers", "Yes");
        data.put("finish", "Matte");
        data.put("typeOfHandles", "Steel");
        data.put("internalAndExternalColor", "Brown");
        data.put("width", "100cm");
        data.put("height", "200cm");
        data.put("depth", "50cm");
        data.put("montage", "Manual");
        data.put("purpose", "Storage");


        IDirector cabinetDirector = new CabinetDirector();
        Cabinet cabinet = cabinetDirector.create(data);

        assertThat(cabinet).isNotNull();
    }
}
