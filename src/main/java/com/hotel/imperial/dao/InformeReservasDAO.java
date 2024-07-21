package com.hotel.imperial.dao;

import com.hotel.imperial.conexion.ConnectionFactory;
import com.hotel.imperial.entidades.dto.InformeReservasDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InformeReservasDAO {

    private final ConnectionFactory connectionFactory;

    public InformeReservasDAO() {
        this.connectionFactory = new ConnectionFactory();
    }

    public InformeReservasDAO(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public List<InformeReservasDTO> obtenerVistaClientes() {
        List<InformeReservasDTO> listaClientes = new ArrayList<>();

        try ( Connection con = connectionFactory.recuperaConexion()) {
            String sql = "SELECT Año, Mes, TotalClientes, TotalPersonasHospedadas, TotalReservas FROM VistaClientes";

            try ( PreparedStatement stmt = con.prepareStatement(sql);  ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    InformeReservasDTO dto = new InformeReservasDTO();
                    dto.setAnho(rs.getInt("Año"));
                    dto.setMes(rs.getInt("Mes"));
                    dto.setTotalClientes(rs.getInt("TotalClientes"));
                    dto.setTotalPersonasHospedadas(rs.getInt("TotalPersonasHospedadas"));
                    dto.setTotalReservas(rs.getInt("TotalReservas"));
                    listaClientes.add(dto);
                }
            }
        } catch (SQLException e) {

        }

        return listaClientes;
    }
}
