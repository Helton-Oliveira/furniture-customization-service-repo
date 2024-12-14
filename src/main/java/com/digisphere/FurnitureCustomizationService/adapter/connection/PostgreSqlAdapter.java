package com.digisphere.FurnitureCustomizationService.adapter.connection;

import com.digisphere.FurnitureCustomizationService.infra.errorHandler.CustomError;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class PostgreSqlAdapter implements IConnection {
    private Connection connection;

    @Override
    public PreparedStatement query(String sql) {
        try {
            return connect().prepareStatement(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
           throw new CustomError("ERRO DE CONEXÃO");
        }
    }

    @Override
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new CustomError("ERRO DE CONEXÃO");
        }
    }

    private Connection connect() {
        try {
            Properties properties = new Properties();
            InputStream input = getClass().getClassLoader().getResourceAsStream("env.properties");
            if ((input == null)) {
                System.out.println("ERRO COM AS CREDENCIAIS DO BANCO");
                throw new CustomError("ERRO INESPERADO, TENTE NOVAMENTE MAIS TARDE...");
            }
            properties.load(input);
            String DB_URL = properties.getProperty("DB_URL");
            String USER = properties.getProperty("DB_USER");
            String PASS = properties.getProperty("DB_PASSWORD");

            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (IOException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
