package com.digisphere.FurnitureCustomizationService.infra.DAO.states;

import com.digisphere.FurnitureCustomizationService.adapter.connection.IConnection;
import com.digisphere.FurnitureCustomizationService.application.domain.table.domain.Table;

import java.sql.SQLException;

public class TableDAO implements IDAO {
    private final IConnection connection;

    public TableDAO(IConnection connection) {
        this.connection = connection;
    }

    @Override
    public boolean save(Object data) {
        var product = (Table) data;
        try {
            var st = connection.query("INSERT INTO tables (table_id, creators_cpf, material_id, frame_material, format, width, height, depth, number_of_feet, montage, purpose) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            st.setObject(1, product.getId());
            st.setString(2, product.getCreatorsCpf());
            st.setObject(3, product.getMaterialId());
            st.setString(4, product.getFrameMaterial());
            st.setString(5, product.getFormat());
            st.setDouble(6, Double.parseDouble(product.getDimensions().get("width")));
            st.setDouble(7, Double.parseDouble(product.getDimensions().get("height")));
            st.setDouble(8, Double.parseDouble(product.getDimensions().get("length")));
            st.setString(9, product.getNumberOfFeet());
            st.setString(10, product.getMontage());
            st.setString(11, product.getPurpose());
            var result = st.executeUpdate();
            if(result == 0) throw new RuntimeException("ERRO AO SALVAR MESA");
            connection.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("ERRO DE CONEXAO");
        }
    }
}
