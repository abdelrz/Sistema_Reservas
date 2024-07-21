package com.hotel.imperial.persistencia;

import com.hotel.imperial.jpa.Metodo_PagoJpaController;
import com.hotel.imperial.entidades.Metodo_Pago;
import java.util.List;

public class ControladorPersistenciaMetodoPago {

    Metodo_PagoJpaController metodo_PagoJpaController = new Metodo_PagoJpaController();

    public List<Metodo_Pago> listarMetodoPago() {
        return metodo_PagoJpaController.findMetodo_PagoEntities();
    }

    public Metodo_Pago buscarMetodoPagoPorNombre(String metodoPago) {
        return metodo_PagoJpaController.buscarMetodoPagoPorNombre(metodoPago);
    }

}
