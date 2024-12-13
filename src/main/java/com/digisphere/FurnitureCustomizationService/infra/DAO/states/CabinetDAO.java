package com.digisphere.FurnitureCustomizationService.infra.DAO.states;

import com.digisphere.FurnitureCustomizationService.adapter.connection.IConnection;
import com.digisphere.FurnitureCustomizationService.application.domain.cabinet.domain.Cabinet;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CabinetDAO extends AbstractDAO {

    public CabinetDAO(IConnection connection) {
        super(connection);
    }

    @Override
    protected PreparedStatement createSql() {
        return connection.query("INSERT INTO cabinets (cabinet_id, creators_cpf, material_id, number_of_doors, door_type, number_of_drawers, closing_system, internal_dividers, finish, type_of_handles, " +
                "internal_and_external_color, width, height, depth, montage, purpose) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
    }

    @Override
    protected void buildInsertion(Object obj, PreparedStatement st) throws SQLException {
        var product = (Cabinet) obj;

        st.setObject(1, product.getId());
        st.setString(2, product.getCreatorsCpf());
        st.setObject(3, product.getMaterialId());
        st.setInt(4, Integer.parseInt(product.getNumberOfDoors()));
        st.setString(5, product.getDoorType());
        st.setInt(6, Integer.parseInt(product.getNumberOfDrawers()));
        st.setString(7, product.getClosingSystem());
        st.setString(8, product.getInternalDividers());
        st.setString(9, product.getFinish());
        st.setString(10, product.getTypeOfHandles());
        st.setString(11, product.getInternalAndExternalColor());
        st.setDouble(12, Double.parseDouble(product.getDimensions().get("width")));
        st.setDouble(13, Double.parseDouble(product.getDimensions().get("height")));
        st.setDouble(14, Double.parseDouble(product.getDimensions().get("depth")));
        st.setString(15, product.getMontage());
        st.setString(16, product.getPurpose());


    }
}
