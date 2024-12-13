package com.digisphere.FurnitureCustomizationService.infra.DAO.states;

import com.digisphere.FurnitureCustomizationService.adapter.connection.IConnection;
import com.digisphere.FurnitureCustomizationService.application.domain.chair.domain.Chair;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ChairDAO extends AbstractDAO {
    public ChairDAO(IConnection connection) {
        super(connection);
    }

    @Override
    protected PreparedStatement createSql() {
        return connection.query("INSERT INTO chairs (chair_id, creators_cpf, material_id, upholstery, adjustable_height, armrests, seat_rotation, " +
                "maximum_weight_support, leg_style, seat_and_frame_color, purpose) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
    }

    @Override
    protected void buildInsertion(Object obj, PreparedStatement st) throws SQLException {
        var product = (Chair) obj;

        st.setObject(1, product.getId());
        st.setString(2, product.getCreatorsCpf());
        st.setObject(3, product.getMaterialId());
        st.setString(4, product.getUpholstery());
        st.setBoolean(5, product.getAdjustableHeight());
        st.setBoolean(6, product.getArmrests());
        st.setBoolean(7, product.getSeatRotation());
        st.setString(8, product.getMaximumWeightSupport());
        st.setString(9, product.getLegStyle());
        st.setString(10, product.getSeatAndFrameColor());
        st.setString(11, product.getPurpose());

    }
}
