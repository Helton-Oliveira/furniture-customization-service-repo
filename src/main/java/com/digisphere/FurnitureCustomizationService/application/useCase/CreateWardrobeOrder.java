/*package com.digisphere.FurnitureCustomizationService.application.useCase;

import com.digisphere.FurnitureCustomizationService.application.facadePattern.IProcessOrder;

import java.util.Map;

public class CreateWardrobeOrder implements IUseCase{
    private final IProcessOrder directors;

    public CreateWardrobeOrder(IProcessOrder directors) {
        this.directors = directors;
    }

    @Override
    public String execute(Map<String, String> data) {
        var director = directors.createCabinet(data);

        if(director == null) throw new RuntimeException("ERRO AO CRIAR ARMARIO");
        return "PEDIDO DE ARMARIO CRIADO COM SUCESSO!";
    }
}*/
