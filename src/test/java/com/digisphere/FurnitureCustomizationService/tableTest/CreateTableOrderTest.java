package com.digisphere.FurnitureCustomizationService.tableTest;

import com.digisphere.FurnitureCustomizationService.application.facadePattern.DirectorsFacade;
import com.digisphere.FurnitureCustomizationService.application.facadePattern.IDirectorsFacade;
import com.digisphere.FurnitureCustomizationService.application.table.domain.Table;
import com.digisphere.FurnitureCustomizationService.application.table.useCases.CreateTableOrder;
import com.digisphere.FurnitureCustomizationService.application.table.useCases.interfaces.ICreateTableOrder;
import com.digisphere.FurnitureCustomizationService.infra.userChecker.IUserExistenceChecker;
import com.digisphere.FurnitureCustomizationService.infra.userChecker.UserExistenceChecker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateTableOrderTest {

    @Test
    @DisplayName("Deve criar uma mesa")
    void createTableOrder() {
        IDirectorsFacade directorsFacade = new DirectorsFacade();
        IUserExistenceChecker userExistenceChecker = new UserExistenceChecker();
        ICreateTableOrder tableOrder = new CreateTableOrder(directorsFacade, userExistenceChecker);
        Map<String, String> data = new HashMap<>();
        data.put("creatorsId", UUID.randomUUID().toString());
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
