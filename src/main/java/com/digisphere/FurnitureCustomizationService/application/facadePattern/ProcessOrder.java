package com.digisphere.FurnitureCustomizationService.application.facadePattern;

import com.digisphere.FurnitureCustomizationService.application.directors.IDirector;
import com.digisphere.FurnitureCustomizationService.application.directors.OrderDirector;
import com.digisphere.FurnitureCustomizationService.application.directors.TableDirector;
import com.digisphere.FurnitureCustomizationService.application.utils.RequestValidator;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

public class ProcessOrder implements IProcessOrder{
    private IDirector director;
    private final IDirector oderDirector = new OrderDirector();

    public void validateFields(List<String> fields, Map<String, String> reqData) {
        RequestValidator.validateRequestFields(reqData ,fields);
    }

    public String process(Map<String, String> reqData) {
        switchDirector(reqData.get("category"));
        var product = director.create(reqData);
        try {
            reqData.put("productId", String.valueOf(product.getClass().getMethod("getId").invoke(product)));

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            System.out.println(e.getMessage());
        }
        var oder = oderDirector.create(reqData);
        if(oder == null) throw new RuntimeException("ERRO PEDIDO NAO PROCESSAD, TENTE NOVAMENTE MAIS TARDE...");

        return "PEDIDO RELIZADO COM SUCESSO!";
    }

    private void switchDirector(String director) {
        if (director.equalsIgnoreCase("table")) this.director = new TableDirector();
    }
}
