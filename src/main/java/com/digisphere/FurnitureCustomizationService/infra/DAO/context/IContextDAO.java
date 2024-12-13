package com.digisphere.FurnitureCustomizationService.infra.DAO.context;

public interface IContextDAO {
    void changeState(String state);
    boolean save(Object data);
}
