package com.digisphere.FurnitureCustomizationService.infra.DAO.context;

import com.digisphere.FurnitureCustomizationService.adapter.connection.IConnection;
import com.digisphere.FurnitureCustomizationService.adapter.connection.PostgreSqlAdapter;
import com.digisphere.FurnitureCustomizationService.infra.DAO.states.IDAO;
import com.digisphere.FurnitureCustomizationService.infra.DAO.states.TableDAO;

public class ContextDAO implements IContextDAO{
    private IDAO currentState;
    private final IConnection connection = new PostgreSqlAdapter();

    @Override
    public void changeState(String state) {
        switch (state.toLowerCase()) {
            case "table" -> currentState = new TableDAO(connection);
        }
    }

    @Override
    public boolean save(Object data) {
        return currentState.save(data);
    }
}
