package com.hotel.imperial.logica;

import com.hotel.imperial.entidades.Cliente;
import com.hotel.imperial.entidades.Pago;
import com.hotel.imperial.entidades.Reserva;
import com.hotel.imperial.persistencia.ControladorPersistenciaBuscar;
import java.util.List;

public class ControladorBuscar {

    ControladorPersistenciaBuscar controladorPersistenciaBuscar = new ControladorPersistenciaBuscar();

    public List<Cliente> buscarClientesPorDni(String dni) {
        return controladorPersistenciaBuscar.buscarClientesPorDni(dni);
    }

    public List<Reserva> buscarReservasPorDni(String dni) {
        return controladorPersistenciaBuscar.buscarReservasPorDni(dni);
    }

    public List<Pago> buscarPagosPorDni(String dni) {
        return controladorPersistenciaBuscar.buscarPagosPorDni(dni);
    }
}
