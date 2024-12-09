package com.digisphere.FurnitureCustomizationService.application.command.commands;

import com.digisphere.FurnitureCustomizationService.application.useCase.IProcessOrder;
import com.digisphere.FurnitureCustomizationService.application.utils.RequestValidator;
import com.digisphere.FurnitureCustomizationService.infra.userChecker.UserExistenceChecker;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public abstract class AbstractCommand {
    protected final IProcessOrder processOrder;
    protected final Map<String, String> req;
    protected List<String> DEFAULT_FIELDS = new ArrayList<>(List.of("material", "category", "creatorsId", "quantity", "price", "purpose"));

    public AbstractCommand(IProcessOrder processOrder, Map<String, String> req) {
        this.processOrder = processOrder;
        this.req = req;
    }

    protected void validateRequestFields(List<String> fields) {
        RequestValidator.validateRequestFields(req, fields);
        UserExistenceChecker.doesUserExist(UUID.fromString(req.get("creatorsId")));
    }

    public abstract String execute();
    protected abstract List<String> requiredFields();
}
