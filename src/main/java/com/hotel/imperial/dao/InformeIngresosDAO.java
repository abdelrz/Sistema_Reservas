package com.hotel.imperial.dao;

import com.hotel.imperial.conexion.ConnectionFactory;
import com.hotel.imperial.entidades.dto.InformeIngresosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InformeIngresosDAO {

    private final ConnectionFactory connectionFactory;

    public InformeIngresosDAO() {
        this.connectionFactory = new ConnectionFactory();
    }

    public InformeIngresosDAO(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public List<InformeIngresosDTO> obtenerVistaIngresos() {
        List<InformeIngresosDTO> ingresosList = new ArrayList<>();
        try ( Connection con = connectionFactory.recuperaConexion()) {
            String query = "SELECT Año, Mes, Ingresos, IngresosPorDaños, TotalIngresos FROM VistaIngresos";
            try ( PreparedStatement ps = con.prepareStatement(query);  ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int anho = rs.getInt("Año");
                    int mes = rs.getInt("Mes");
                    double ingresos = rs.getDouble("Ingresos");
                    double ingresosPorDanios = rs.getDouble("IngresosPorDaños");
                    double totalIngresos = rs.getDouble("TotalIngresos");
                    ingresosList.add(new InformeIngresosDTO(ingresos, ingresosPorDanios, totalIngresos, mes, anho));
                }
            }
        } catch (SQLException e) {
            
        }
        return ingresosList;
    }
}
