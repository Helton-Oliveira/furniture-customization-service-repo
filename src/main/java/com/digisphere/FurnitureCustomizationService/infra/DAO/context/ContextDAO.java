package com.digisphere.FurnitureCustomizationService.infra.DAO.context;

import com.digisphere.FurnitureCustomizationService.adapter.connection.IConnection;
import com.digisphere.FurnitureCustomizationService.adapter.connection.PostgreSqlAdapter;
import com.digisphere.FurnitureCustomizationService.infra.DAO.states.*;

public class ContextDAO implements IContextDAO{
    private AbstractDAO currentState;
    private final IConnection connection = new PostgreSqlAdapter();

    @Override
    public void changeState(String state) {
        switch (state.toLowerCase()) {
            case "table" -> currentState = new TableDAO(connection);
            case "cabinet" -> currentState = new CabinetDAO(connection);
            case "bookcase" -> currentState = new BookCaseDAO(connection);
            case "chair" -> currentState = new ChairDAO(connection);
        }
    }

    @Override
    public boolean save(Object data) {
        return currentState.save(data);
    }
}
