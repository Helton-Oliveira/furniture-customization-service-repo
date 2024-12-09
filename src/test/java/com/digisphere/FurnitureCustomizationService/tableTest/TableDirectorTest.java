package com.digisphere.FurnitureCustomizationService.tableTest;

import com.digisphere.FurnitureCustomizationService.application.directors.IDirector;
import com.digisphere.FurnitureCustomizationService.application.table.domain.Table;
import com.digisphere.FurnitureCustomizationService.application.directors.TableDirector;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class TableDirectorTest {

    @Test
    @DisplayName("deve criar uma mesa")
    void createTable() {
        Map<String, String> data = new HashMap<>();

        data.put("creatorsCpf", "12345678901");
        data.put("material", "wood");
        data.put("frameMaterial", "metal");
        data.put("format", "rectangular");
        data.put("width", "100cm");
        data.put("length", "200cm");
        data.put("height", "150cm");
        data.put("numberOfFeet", "4");
        data.put("montage", "detachable");
        data.put("purpose", "outdoor");

        IDirector tableDirector = new TableDirector();
        Table table = tableDirector.create(data);

        assertThat(table.getId()).isNotNull();

        //testing data and creation flow
        data.forEach((key, value) -> {
                    assertThat(key).isNotNull();
                    assertThat(value).isNotNull();
                    assertThat(value).isNotBlank();
                }
        );
    }
}
