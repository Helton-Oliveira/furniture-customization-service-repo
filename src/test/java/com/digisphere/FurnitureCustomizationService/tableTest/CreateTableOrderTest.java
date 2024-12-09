package com.digisphere.FurnitureCustomizationService.tableTest;

import com.digisphere.FurnitureCustomizationService.application.command.IInvoker;
import com.digisphere.FurnitureCustomizationService.application.command.Invoker;
import com.digisphere.FurnitureCustomizationService.application.useCase.ProcessOrder;
import com.digisphere.FurnitureCustomizationService.application.useCase.IProcessOrder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateTableOrderTest {

  /*  @Test
    @DisplayName("Deve criar uma mesa")*/
    /*void createTableOrder() {
        IDirectorsFacade directorsFacade = new DirectorsFacade();
        IUserExistenceChecker userExistenceChecker = new UserExistenceChecker();
        Factory orderFactory = new OrderFactory();
        IUseCase tableOrder = new CreateTableOrder(directorsFacade, userExistenceChecker, orderFactory);
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
    }*/


    @Test
    @DisplayName("Deve usar o comando para iniciar ")
    void createTableCommand() {
        IProcessOrder processOrder = new ProcessOrder();
        Map<String, String> data = new HashMap<>();
        data.put("creatorsId", UUID.randomUUID().toString());
        data.put("category", "table");
        data.put("material", "wood");
        data.put("frameMaterial", "metal");
        data.put("format", "rectangular");
        data.put("width", "100cm");
        data.put("length", "200cm");
        data.put("height", "150cm");
        data.put("numberOfFeet", "4");
        data.put("montage", "detachable");
        data.put("purpose", "outdoor");
        data.put("price", "299.90");
        data.put("quantity", "4");
        IInvoker invoker = new Invoker(processOrder, data);

        String table = invoker.executeCommand(data.get("category"));
        assertThat(table).isEqualTo("PEDIDO RELIZADO COM SUCESSO!");
    }
}
