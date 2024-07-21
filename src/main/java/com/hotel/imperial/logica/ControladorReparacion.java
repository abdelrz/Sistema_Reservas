
package com.hotel.imperial.logica;

import com.hotel.imperial.entidades.Pago;
import com.hotel.imperial.entidades.Reparacion;
import com.hotel.imperial.persistencia.ControladorPersistenciaReparacion;

public class ControladorReparacion {

    ControladorPersistenciaReparacion controladorPersistenciaReparacion = new ControladorPersistenciaReparacion();
    
    public Reparacion obtenerReparacionPorPago(Pago pago) {
        return controladorPersistenciaReparacion.obtenerReparacionPorPago(pago);
    }
    
}
