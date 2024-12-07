package com.digisphere.FurnitureCustomizationService.application.useCase;

import com.digisphere.FurnitureCustomizationService.application.facadePattern.IDirectorsFacade;
import com.digisphere.FurnitureCustomizationService.infra.userChecker.UserExistenceChecker;

import java.util.Map;
import java.util.UUID;

public class CreateChairOrder implements IUseCase {
    private final IDirectorsFacade directorsFacade;

    public CreateChairOrder(IDirectorsFacade directorsFacade1) {
        this.directorsFacade = directorsFacade1;
    }

    @Override
    public String execute(Map<String, String> reqParams) {
        Boolean EXIST_USER = UserExistenceChecker.doesUserExist(UUID.fromString(reqParams.get("creatorsId")));
        if (!EXIST_USER) throw new RuntimeException("ERRO CRIADOR DO PRODUTO INEXISTENTE");
        var table = directorsFacade.createChair(reqParams);
        reqParams.put("productId", table.getId().toString());
        var oder = directorsFacade.createOrder(reqParams);
        return "PEDIDO CRIADO COM SUCESSO!";
    }
}
