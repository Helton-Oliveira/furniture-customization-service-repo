package com.digisphere.FurnitureCustomizationService.infra.DAO.states;

import com.digisphere.FurnitureCustomizationService.adapter.connection.IConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class AbstractDAO {
    protected final IConnection connection;

    public AbstractDAO(IConnection connection) {
        this.connection = connection;
    }

    public boolean save(Object product) {
        try {
            var st = createSql();
            buildInsertion(product, st);
            var result = st.executeUpdate();
            if (result == 0) throw new RuntimeException("ERRO AO SALVAR " + product.getClass().getName());
            connection.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("ERRO DE CONEXAO");
        }

    }

    protected abstract PreparedStatement createSql();
   protected abstract void buildInsertion(Object product, PreparedStatement st) throws SQLException;
}
