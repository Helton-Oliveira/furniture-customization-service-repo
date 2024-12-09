package com.digisphere.FurnitureCustomizationService.application.useCase;

import com.digisphere.FurnitureCustomizationService.application.directors.IDirector;
import com.digisphere.FurnitureCustomizationService.application.directors.OrderDirector;
import com.digisphere.FurnitureCustomizationService.application.utils.DirectorSwitcher;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class ProcessOrder implements IProcessOrder{
    private final IDirector oderDirector = new OrderDirector();

    public String execute(Map<String, String> reqData) {
        IDirector director = DirectorSwitcher.choice(reqData.get("category"));
        var product = director.create(reqData);
        try {
            reqData.put("productId", String.valueOf(product.getClass().getMethod("getId").invoke(product)));

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            System.out.println(e.getMessage());
        }
        var order = oderDirector.create(reqData);
        if(order == null) throw new RuntimeException("ERRO PEDIDO NAO PROCESSAD, TENTE NOVAMENTE MAIS TARDE...");

        return "PEDIDO RELIZADO COM SUCESSO!";
    }

}
