package com.hotel.imperial.persistencia;

import com.hotel.imperial.jpa.ReparacionJpaController;
import com.hotel.imperial.entidades.Pago;
import com.hotel.imperial.entidades.Reparacion;

public class ControladorPersistenciaReparacion {

    ReparacionJpaController reparacionJpaController = new ReparacionJpaController();

    public void guardarReparacion(Reparacion reparacion) {
        reparacionJpaController.create(reparacion);
    }

    public Reparacion obtenerReparacionPorPago(Pago pago) {
        return reparacionJpaController.obtenerReparacionPorPago(pago);
    }

}
