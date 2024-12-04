package com.digisphere.FurnitureCustomizationService.application.table.useCases;

import com.digisphere.FurnitureCustomizationService.application.facadePattern.IDirectorsFacade;
import com.digisphere.FurnitureCustomizationService.application.order.orderFactory.Factory;
import com.digisphere.FurnitureCustomizationService.application.table.domain.Table;
import com.digisphere.FurnitureCustomizationService.application.table.useCases.interfaces.ICreateTableOrder;
import com.digisphere.FurnitureCustomizationService.infra.userChecker.IUserExistenceChecker;

import java.util.Map;
import java.util.UUID;

public class CreateTableOrder implements ICreateTableOrder {
    private final IDirectorsFacade directorsFacade;
    private final IUserExistenceChecker userExistenceChecker;
    private final Factory orderFactor;

    public CreateTableOrder(IDirectorsFacade directorsFacade, IUserExistenceChecker userExistenceChecker, Factory orderFactor) {
        this.directorsFacade = directorsFacade;
        this.userExistenceChecker = userExistenceChecker;
        this.orderFactor = orderFactor;
    }

    @Override
    public Table execute(Map<String, String> data) {
        Boolean EXIST_USER = userExistenceChecker.doesUserExist(UUID.fromString(data.get("creatorsId")));
        if (!EXIST_USER) throw new RuntimeException("ERRO CRIADOR DO PRODUTO INEXISTENTE");
        var table = directorsFacade.createTable(data);
        data.put("productId", table.getId().toString());

        return table;
    }
}
