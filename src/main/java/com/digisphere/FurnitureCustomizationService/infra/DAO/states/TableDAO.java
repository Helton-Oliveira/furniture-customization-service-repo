package com.digisphere.FurnitureCustomizationService.infra.DAO.states;

import com.digisphere.FurnitureCustomizationService.adapter.connection.IConnection;
import com.digisphere.FurnitureCustomizationService.application.domain.table.domain.Table;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TableDAO extends AbstractDAO {

    public TableDAO(IConnection connection) {
        super(connection);
    }

    @Override
    protected PreparedStatement createSql() {
        return connection.query("INSERT INTO tables (table_id, creators_cpf, material_id, frame_material, format, width, height, depth, number_of_feet, montage, purpose) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
    }

    @Override
    protected void buildInsertion(Object obj, PreparedStatement st) throws SQLException {
        var product = (Table) obj;

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

    }


}
