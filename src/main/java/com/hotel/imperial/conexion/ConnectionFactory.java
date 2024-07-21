
package com.hotel.imperial.conexion;

import java.sql.Connection;
import java.sql.SQLException;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import javax.sql.DataSource;

public class ConnectionFactory {

    private final DataSource datasource;

    public ConnectionFactory() {
        var pooledDataSource = new ComboPooledDataSource();
        pooledDataSource.setJdbcUrl("jdbc:mysql://localhost/bd_imperial_inn?useTimeZone=true&serverTimeZone=UTC");
        pooledDataSource.setUser("root");
        pooledDataSource.setPassword("");

        this.datasource = pooledDataSource;
    }

    public Connection recuperaConexion() {
        try {
            Connection connection = this.datasource.getConnection();
            return connection;
        } catch (SQLException e) {
            System.out.println("Error al obtener la conexión: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
