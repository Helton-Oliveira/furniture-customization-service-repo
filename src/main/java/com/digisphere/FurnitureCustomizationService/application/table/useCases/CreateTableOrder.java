package com.digisphere.FurnitureCustomizationService.application.table.useCases;

import com.digisphere.FurnitureCustomizationService.application.facadePattern.IDirectorsFacade;
import com.digisphere.FurnitureCustomizationService.application.table.domain.Table;
import com.digisphere.FurnitureCustomizationService.application.table.useCases.interfaces.ICreateTableOrder;
import com.digisphere.FurnitureCustomizationService.infra.userChecker.IUserExistenceChecker;

import java.util.Map;
import java.util.UUID;

public class CreateTableOrder implements ICreateTableOrder {
    private final IDirectorsFacade directorsFacade;
    private final IUserExistenceChecker userExistenceChecker;

    public CreateTableOrder(IDirectorsFacade directorsFacade, IUserExistenceChecker userExistenceChecker) {
        this.directorsFacade = directorsFacade;
        this.userExistenceChecker = userExistenceChecker;
    }

    @Override
    public Table execute(Map<String, String> data) {
        Boolean EXIST_USER = userExistenceChecker.doesUserExist(UUID.fromString(data.get("creatorsId")));
        if (!EXIST_USER) throw new RuntimeException("ERRO CRIADOR DO PRODUTO INEXISTENTE");
        return directorsFacade.createTable(data);
    }
}
