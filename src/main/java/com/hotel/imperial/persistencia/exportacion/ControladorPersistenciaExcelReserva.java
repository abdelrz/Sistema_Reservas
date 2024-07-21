package com.hotel.imperial.persistencia.exportacion;

import com.hotel.imperial.entidades.Reserva;
import com.hotel.imperial.jpa.ReservaJpaController;
import java.util.List;

public class ControladorPersistenciaExcelReserva {

    ReservaJpaController reservaJpaController = new ReservaJpaController();

    public List<Reserva> obtenerDatosParaExportar() {
        return reservaJpaController.findReservaEntities();
    }

}
