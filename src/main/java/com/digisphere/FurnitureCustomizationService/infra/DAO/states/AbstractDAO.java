package com.digisphere.FurnitureCustomizationService.infra.DAO.states;

import com.digisphere.FurnitureCustomizationService.adapter.connection.IConnection;
import com.digisphere.FurnitureCustomizationService.infra.errorHandler.CustomError;

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
            if (result == 0) throw new CustomError("ERRO AO SALVAR " + product.getClass().getName());
            connection.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new CustomError("ERRO DE CONEXAO, POR FAVOR TENTE MAIS TARDE...");
        }

    }

    protected abstract PreparedStatement createSql();
   protected abstract void buildInsertion(Object obj, PreparedStatement st) throws SQLException;
}
