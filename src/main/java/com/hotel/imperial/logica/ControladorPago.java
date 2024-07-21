package com.hotel.imperial.logica;

import com.hotel.imperial.entidades.Cliente;
import com.hotel.imperial.entidades.Metodo_Pago;
import com.hotel.imperial.entidades.Pago;
import com.hotel.imperial.entidades.Reparacion;
import com.hotel.imperial.entidades.Reserva;
import com.hotel.imperial.persistencia.ControladorPersistenciaCliente;
import com.hotel.imperial.persistencia.ControladorPersistenciaMetodoPago;
import com.hotel.imperial.persistencia.ControladorPersistenciaPago;
import com.hotel.imperial.persistencia.ControladorPersistenciaReparacion;
import com.hotel.imperial.persistencia.ControladorPersistenciaReserva;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class ControladorPago {

    ControladorPersistenciaPago controladorPersistenciaPago = new ControladorPersistenciaPago();

    ControladorPersistenciaReserva controladorPersistenciaReserva = new ControladorPersistenciaReserva();
    ControladorPersistenciaReparacion controladorPersistenciaReparacion = new ControladorPersistenciaReparacion();
    
    ControladorPersistenciaCliente controladorPersistenciaCliente = new ControladorPersistenciaCliente();
    ControladorPersistenciaMetodoPago controladorPersistenciaMetodoPago = new ControladorPersistenciaMetodoPago();

    public void guardarPago(String dni, String metodoPago, Date fechaPago, double pago,
            String descripcionReparacion, double costoReparacion) {

        Cliente clienteExistente = controladorPersistenciaCliente.buscarClientePorDni(dni);

        if (clienteExistente == null) {
            JOptionPane.showMessageDialog(null, "El cliente con DNI " + dni + " no existe. "
                    + "Debe crear primero el cliente antes de hacer el pago.", "Cliente no encontrado",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            Metodo_Pago metodo = controladorPersistenciaMetodoPago.buscarMetodoPagoPorNombre(metodoPago);

            if (metodo == null) {
                JOptionPane.showMessageDialog(null, "El método de pago especificado no existe.",
                        "Método de pago no encontrado", JOptionPane.ERROR_MESSAGE);
            } else {

                Pago objPago = new Pago();
                objPago.setMetodo_pago(metodo);
                objPago.setFecha_pago(fechaPago);
                objPago.setPago(pago);

                Reserva reservaDelCliente = controladorPersistenciaReserva.obtenerReservaAsociadaCliente(dni);

                if (reservaDelCliente == null) {
                    JOptionPane.showMessageDialog(null, "El cliente no tiene ninguna reserva asociada.",
                            "Reserva no encontrada", JOptionPane.ERROR_MESSAGE);
                } else {

                    objPago.setReserva(reservaDelCliente);

                    controladorPersistenciaPago.guardarPago(objPago);

                    if (descripcionReparacion != null && !descripcionReparacion.isEmpty() && costoReparacion > 0) {

                        Reparacion reparacion = new Reparacion();
                        reparacion.setDescripcion(descripcionReparacion);
                        reparacion.setCosto(costoReparacion);

                        reparacion.setPago(objPago);

                        controladorPersistenciaReparacion.guardarReparacion(reparacion);
                    }
                }
            }
        }
    }

    public List<Pago> listarPago() {
        return controladorPersistenciaPago.listarPago();
    }

    public void eliminarPago(int idPago) {
        controladorPersistenciaPago.eliminarPago(idPago);

    }

    public Pago listarPago(int idPago) {
        return controladorPersistenciaPago.listarPago(idPago);
    }

    public void modificarPago(Pago objPago, String dni, String metodoPago, Date fechaPago,
            double pago, String descripcionReparacion, double costoReparacion) {
        
        int pago_id = objPago.getPago_id();
        
        controladorPersistenciaPago.modificarPago(pago_id, dni, metodoPago, fechaPago, 
                pago, descripcionReparacion, costoReparacion);
    }

}
