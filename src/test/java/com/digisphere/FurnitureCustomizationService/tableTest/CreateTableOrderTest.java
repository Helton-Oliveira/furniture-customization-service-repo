package com.digisphere.FurnitureCustomizationService.tableTest;

import com.digisphere.FurnitureCustomizationService.application.table.domain.Table;
import com.digisphere.FurnitureCustomizationService.application.table.tableBuilder.ITableDirector;
import com.digisphere.FurnitureCustomizationService.application.table.tableBuilder.TableDirector;
import com.digisphere.FurnitureCustomizationService.application.table.useCases.CreateTableOrder;
import com.digisphere.FurnitureCustomizationService.application.table.useCases.interfaces.ICreateTableOrder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateTableOrderTest {

    @Test
    @DisplayName("Deve criar uma mesa")
    void createTableOrder() {
        ITableDirector tableDirector = new TableDirector();
        ICreateTableOrder tableOrder = new CreateTableOrder(tableDirector);
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

        Table table = tableOrder.execute(data);
        assertThat(table.getId()).isNotNull();
    }
}
