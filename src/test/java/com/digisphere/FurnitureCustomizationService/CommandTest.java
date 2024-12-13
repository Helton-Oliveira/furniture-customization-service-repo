package com.digisphere.FurnitureCustomizationService;

import com.digisphere.FurnitureCustomizationService.application.command.IInvoker;
import com.digisphere.FurnitureCustomizationService.application.command.Invoker;
import com.digisphere.FurnitureCustomizationService.application.useCase.ProcessOrder;
import com.digisphere.FurnitureCustomizationService.application.useCase.IProcessOrder;
import com.digisphere.FurnitureCustomizationService.infra.DAO.context.ContextDAO;
import com.digisphere.FurnitureCustomizationService.infra.DAO.context.IContextDAO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class CommandTest {

    @Test
    @DisplayName("Deve usar o comando para processar pedido de mesa")
    void createTableCommand() {
        IContextDAO contextDAO = new ContextDAO();
        IProcessOrder processOrder = new ProcessOrder(contextDAO);
        Map<String, String> data = new HashMap<>();
        data.put("creatorsCpf", "93732782077");
        data.put("category", "table");
        data.put("materialId", "40f83189-0a88-48e1-9e7b-730794aac0c5");
        data.put("frameMaterial", "40f83189-0a88-48e1-9e7b-730794aac0c5");
        data.put("format", "rectangular");
        data.put("width", "100");
        data.put("length", "200");
        data.put("height", "150");
        data.put("numberOfFeet", "4");
        data.put("montage", "detachable");
        data.put("purpose", "outdoor");
        data.put("price", "299.90");
        data.put("quantity", "4");
        IInvoker invoker = new Invoker(processOrder, data);

        String table = invoker.executeCommand(data.get("category"));
        assertThat(table).isEqualTo("PEDIDO RELIZADO COM SUCESSO!");
    }

    @Test
    @DisplayName("Deve usar o comando para processar pedido de cadeira")
    void createChairCommand() {
        IContextDAO contextDAO = new ContextDAO();
        IProcessOrder processOrder = new ProcessOrder(contextDAO);
        Map<String, String> data = new HashMap<>();
        data.put("creatorsCpf", "93732782077");
        data.put("category", "chair");
        data.put("quantity", "7");
        data.put("price", "130.0");
        data.put("materialId", "40f83189-0a88-48e1-9e7b-730794aac0c5");
        data.put("upholstery", "Leather");
        data.put("adjustableHeight", "true");
        data.put("armrests", "true");
        data.put("seatRotation", "true");
        data.put("maximumWeightSupport", "150");
        data.put("legStyle", "Five-star");
        data.put("seatAndFrameColor", "Black");
        data.put("purpose", "Office");
        IInvoker invoker = new Invoker(processOrder, data);

        String chair = invoker.executeCommand(data.get("category"));
        assertThat(chair).isEqualTo("PEDIDO RELIZADO COM SUCESSO!");
    }

    @Test
    @DisplayName("Deve usar o comando para processar pedido de armario")
    void createCabinetCommand() {
        IContextDAO contextDAO = new ContextDAO();
        IProcessOrder processOrder = new ProcessOrder(contextDAO);
        Map<String, String> data = new HashMap<>();
        data.put("creatorsCpf", "93732782077");
        data.put("category", "cabinet");
        data.put("quantity", "7");
        data.put("price", "130.0");
        data.put("materialId", "40f83189-0a88-48e1-9e7b-730794aac0c5");
        data.put("numberOfDoors", "4");
        data.put("doorType", "Sliding");
        data.put("numberOfDrawers", "3");
        data.put("closingSystem", "Soft-close");
        data.put("internalDividers", "Yes");
        data.put("finish", "Matte");
        data.put("typeOfHandles", "Steel");
        data.put("internalAndExternalColor", "Brown");
        data.put("width", "100");
        data.put("height", "200");
        data.put("depth", "50");
        data.put("montage", "Manual");
        data.put("purpose", "Storage");
        IInvoker invoker = new Invoker(processOrder, data);

        String cabinet = invoker.executeCommand(data.get("category"));
        assertThat(cabinet).isEqualTo("PEDIDO RELIZADO COM SUCESSO!");
    }

    @Test
    @DisplayName("Deve usar o comando para processar pedido de estante")
    void createBookCaseCommand() {
        IContextDAO contextDAO = new ContextDAO();
        IProcessOrder processOrder = new ProcessOrder(contextDAO);
        Map<String, String> data = new HashMap<>();
        data.put("creatorsCpf", "93732782077");
        data.put("category", "bookCase");
        data.put("quantity", "7");
        data.put("price", "130.0");
        data.put("materialId", "40f83189-0a88-48e1-9e7b-730794aac0c5");
        data.put("numberOfShelves", "5");
        data.put("heightBetweenShelves", "30");
        data.put("mouthingSystem", "Wall-Mounted");
        data.put("width", "100");
        data.put("height", "200");
        data.put("depth", "40");
        data.put("externalFinish", "Glossy");
        data.put("weightSupportedPerShelf", "20");
        data.put("style", "Modern");
        data.put("purpose", "recording scenario");
        IInvoker invoker = new Invoker(processOrder, data);

        String bookCase = invoker.executeCommand(data.get("category"));
        assertThat(bookCase).isEqualTo("PEDIDO RELIZADO COM SUCESSO!");
    }
}
