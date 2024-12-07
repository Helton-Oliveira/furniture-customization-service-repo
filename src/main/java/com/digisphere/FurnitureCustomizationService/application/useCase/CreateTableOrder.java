/*package com.digisphere.FurnitureCustomizationService.application.useCase;

import com.digisphere.FurnitureCustomizationService.application.facadePattern.IProcessOrder;
import com.digisphere.FurnitureCustomizationService.infra.userChecker.UserExistenceChecker;

import java.util.Map;
import java.util.UUID;

public class CreateTableOrder implements IUseCase {
    private final IProcessOrder directorsFacade;

    public CreateTableOrder(IProcessOrder directorsFacade) {
        this.directorsFacade = directorsFacade;
    }

    @Override
    public String execute(Map<String, String> data) {
        Boolean EXIST_USER = UserExistenceChecker.doesUserExist(UUID.fromString(data.get("creatorsId")));
        if (!EXIST_USER) throw new RuntimeException("ERRO CRIADOR DO PRODUTO INEXISTENTE");
        var table = directorsFacade.createTable(data);
        data.put("productId", table.getId().toString());
        var oder = directorsFacade.createOrder(data);
        return "PEDIDO CRIADO COM SUCESSO!";
    }
}*/
