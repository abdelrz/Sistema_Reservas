package com.hotel.imperial.persistencia;

import com.hotel.imperial.jpa.PagoJpaController;
import com.hotel.imperial.entidades.Pago;
import java.util.Date;
import java.util.List;

public class ControladorPersistenciaPago {

    PagoJpaController pagoJpaController = new PagoJpaController();

    public void guardarPago(Pago objPago) {
        pagoJpaController.create(objPago);
    }

    public List<Pago> listarPago() {
        return pagoJpaController.findPagoEntities();
    }

    public void eliminarPago(int idPago) {
        pagoJpaController.eliminarPago(idPago);
    }

    public Pago listarPago(int idPago) {
        return pagoJpaController.findPago(idPago);
    }

    public void modificarPago(int pago_id, String dni, String metodoPago, Date fechaPago,
            double pago, String descripcionReparacion, double costoReparacion) {
        pagoJpaController.modificarPago(pago_id, dni, metodoPago, fechaPago, pago,
                descripcionReparacion, costoReparacion);
    }

}
