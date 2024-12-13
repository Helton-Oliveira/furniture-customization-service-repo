package com.digisphere.FurnitureCustomizationService;

import com.digisphere.FurnitureCustomizationService.application.useCase.IProcessOrder;
import com.digisphere.FurnitureCustomizationService.application.useCase.ProcessOrder;
import com.digisphere.FurnitureCustomizationService.application.visitor.IVisitor;
import com.digisphere.FurnitureCustomizationService.application.visitor.OderVisitor;
import com.digisphere.FurnitureCustomizationService.infra.DAO.context.ContextDAO;
import com.digisphere.FurnitureCustomizationService.infra.DAO.context.IContextDAO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class VisitorPatternTest {

    @Test
    @DisplayName("Deve validar o padrao visitor")
    void validVisitorPattern() {
        IContextDAO contextDAO = new ContextDAO();
        IVisitor visitor = new OderVisitor();
        IProcessOrder processOrder = new ProcessOrder(contextDAO, visitor);
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

        processOrder.execute(data);

    }
}
