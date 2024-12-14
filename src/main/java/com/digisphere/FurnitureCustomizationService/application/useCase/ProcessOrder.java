package com.digisphere.FurnitureCustomizationService.application.useCase;

import com.digisphere.FurnitureCustomizationService.application.directors.IDirector;
import com.digisphere.FurnitureCustomizationService.application.directors.OrderDirector;
import com.digisphere.FurnitureCustomizationService.application.domain.order.domain.Order;
import com.digisphere.FurnitureCustomizationService.application.utils.DirectorSwitcher;
import com.digisphere.FurnitureCustomizationService.application.visitor.IVisitor;
import com.digisphere.FurnitureCustomizationService.infra.DAO.context.IContextDAO;
import com.digisphere.FurnitureCustomizationService.infra.errorHandler.CustomError;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class ProcessOrder implements IProcessOrder{
    private final IDirector oderDirector = new OrderDirector();
    private final IContextDAO contextDAO;
    private final IVisitor visitor;

    public ProcessOrder(IContextDAO contextDAO, IVisitor visitor) {
        this.contextDAO = contextDAO;
        this.visitor = visitor;
    }

    public String execute(Map<String, String> reqData) {
        IDirector director = DirectorSwitcher.choice(reqData.get("category"));
        var product = director.create(reqData);
        contextDAO.changeState(reqData.get("category"));
        contextDAO.save(product);
        try {
            reqData.put("productId", String.valueOf(product.getClass().getMethod("getId").invoke(product)));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            System.out.println(e.getMessage());
        }
        Order order = oderDirector.create(reqData);
        if(order == null) throw new CustomError("ERRO PEDIDO NAO PROCESSAD, TENTE NOVAMENTE MAIS TARDE...");
        order.accept(visitor);

        return "PEDIDO RELIZADO COM SUCESSO!";
    }

}
