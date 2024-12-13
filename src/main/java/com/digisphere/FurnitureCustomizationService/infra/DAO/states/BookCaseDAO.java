package com.digisphere.FurnitureCustomizationService.infra.DAO.states;

import com.digisphere.FurnitureCustomizationService.adapter.connection.IConnection;
import com.digisphere.FurnitureCustomizationService.application.domain.bookcase.domain.BookCase;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookCaseDAO extends AbstractDAO{
    public BookCaseDAO(IConnection connection) {
        super(connection);
    }

    @Override
    protected PreparedStatement createSql() {
        return connection.query("INSERT INTO shelves (shelf_id, creators_cpf, material_id, number_of_shelves, height_between_shelves, " +
                "mounting_system, width, height, depth, external_finish, weight_supported_per_shelf, style, purpose) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
    }

    @Override
    protected void buildInsertion(Object obj, PreparedStatement st) throws SQLException {
        var product = (BookCase) obj;

        st.setObject(1, product.getId());
        st.setString(2, product.getCreatorsCpf());
        st.setObject(3, product.getMaterialId());
        st.setInt(4, Integer.parseInt(product.getNumberOfShelves()));
        st.setInt(5, Integer.parseInt(product.getHeightBetweenShelves()));
        st.setString(6, product.getMouthingSystem());
        st.setDouble(7, Double.parseDouble(product.getDimensions().get("width")));
        st.setDouble(8, Double.parseDouble(product.getDimensions().get("height")));
        st.setDouble(9, Double.parseDouble(product.getDimensions().get("depth")));
        st.setString(10, product.getExternalFinish());
        st.setInt(11, Integer.parseInt(product.getWeightSupportedPerShelf()));
        st.setString(12, product.getStyle());
        st.setString(13, product.getPurpose());

    }
}
