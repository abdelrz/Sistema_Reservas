package com.hotel.imperial.persistencia;

import com.hotel.imperial.entidades.Cliente;
import com.hotel.imperial.entidades.Pago;
import com.hotel.imperial.entidades.Reserva;
import com.hotel.imperial.dao.BuscarDAO;
import java.util.List;

public class ControladorPersistenciaBuscar {

    BuscarDAO buscarDAO = new BuscarDAO();
    
    public List<Cliente> buscarClientesPorDni(String dni) {
        return buscarDAO.buscarClientesPorDni(dni);
    }

    public List<Reserva> buscarReservasPorDni(String dni) {
        return buscarDAO.buscarReservasPorDni(dni);
    }

    public List<Pago> buscarPagosPorDni(String dni) {
        return buscarDAO.buscarPagosPorDni(dni);
    }
}
