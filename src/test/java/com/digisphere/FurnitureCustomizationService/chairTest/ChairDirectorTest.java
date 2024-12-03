package com.digisphere.FurnitureCustomizationService.chairTest;

import com.digisphere.FurnitureCustomizationService.application.chair.chairBuilder.ChairDirector;
import com.digisphere.FurnitureCustomizationService.application.chair.chairBuilder.IChairDirector;
import com.digisphere.FurnitureCustomizationService.application.chair.domain.Chair;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;


public class ChairDirectorTest {

    @Test
    @DisplayName("deve criar uma cadeira")
    void createChair() {
        Map<String, String> data = new HashMap<>();

        data.put("creatorsId", UUID.randomUUID().toString());
        data.put("material", "Metal");
        data.put("upholstery", "Leather");
        data.put("adjustableHeight", "true");
        data.put("armrests", "true");
        data.put("seatRotation", "true");
        data.put("maximumWeightSupport", "150kg");
        data.put("legStyle", "Five-star");
        data.put("seatAndFrameColor", "Black");
        data.put("purpose", "Office");

        IChairDirector director = new ChairDirector();
        Chair chair = director.createChair(data);

        assertThat(chair).isNotNull();
    }
}
