package com.hotel.imperial.persistencia.exportacion;

import com.hotel.imperial.entidades.Pago;
import com.hotel.imperial.jpa.PagoJpaController;
import java.util.List;

public class ControladorPersistenciaExcelPago {

    PagoJpaController pagoJpaController = new PagoJpaController();
    
    public List<Pago> obtenerDatosParaExportar() {
        return pagoJpaController.findPagoEntities();
    }

}
