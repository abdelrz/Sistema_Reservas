package com.hotel.imperial.persistencia;

import com.hotel.imperial.jpa.ReservaJpaController;
import com.hotel.imperial.entidades.Reserva;
import java.time.LocalDateTime;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorPersistenciaReserva {

    ReservaJpaController reservaJpaController = new ReservaJpaController();

    public void guardarReserva(Reserva reserva) {
        reservaJpaController.create(reserva);
    }

    public Reserva obtenerReservaAsociadaCliente(String dniCliente) {
        return reservaJpaController.obtenerReservaAsociadaCliente(dniCliente);
    }

    public List<Reserva> listarReserva() {
        return reservaJpaController.findReservaEntities();
    }

    public void eliminarReserva(int idReserva) {
        reservaJpaController.eliminarReservaYAsociaciones(idReserva);
    }

    public Reserva listarReserva(int idReserva) {
        return reservaJpaController.findReserva(idReserva);
    }

    public void modificarReserva(int reservaId, String habitacionIds, LocalDateTime fechaLlegada,
            LocalDateTime fechaSalida, int numeroHospedados) {
        try {
            reservaJpaController.modificarReserva(reservaId, habitacionIds, fechaLlegada, fechaSalida, numeroHospedados);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistenciaReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
