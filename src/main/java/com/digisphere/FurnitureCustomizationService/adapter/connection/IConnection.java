package com.digisphere.FurnitureCustomizationService.adapter.connection;

import java.sql.PreparedStatement;

public interface IConnection {
    PreparedStatement query(String sql);
    void close();
}
