package com.digisphere.FurnitureCustomizationService.adapter.controller;

import com.digisphere.FurnitureCustomizationService.application.command.Invoker;
import com.digisphere.FurnitureCustomizationService.application.useCase.IProcessOrder;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/furniture")
public class FurnitureController {
    private final IProcessOrder processOrder;

    public FurnitureController(IProcessOrder processOrder) {
        this.processOrder = processOrder;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<String> processFurniture(@RequestBody Map<String, String> data) {
        var invoker = new Invoker(processOrder, data);
        var response = invoker.executeCommand(data.get("category"));

        return ResponseEntity.ok(response);
    }
}
