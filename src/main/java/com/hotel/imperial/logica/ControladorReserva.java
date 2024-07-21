package com.hotel.imperial.logica;

import com.hotel.imperial.entidades.Cliente;
import com.hotel.imperial.entidades.Habitacion;
import com.hotel.imperial.entidades.Reserva;
import com.hotel.imperial.entidades.Reserva_Habitacion;
import com.hotel.imperial.persistencia.ControladorPersistenciaCliente;
import com.hotel.imperial.persistencia.ControladorPersistenciaHabitacion;
import com.hotel.imperial.persistencia.ControladorPersistenciaReserva;
import com.hotel.imperial.persistencia.ControladorPersistenciaReservaHabitacion;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ControladorReserva {

    ControladorPersistenciaReserva controladorPersistenciaReserva = new ControladorPersistenciaReserva();

    ControladorPersistenciaCliente controladorPersistenciaCliente = new ControladorPersistenciaCliente();
    ControladorPersistenciaHabitacion controladorPersistenciaHabitacion = new ControladorPersistenciaHabitacion();
    ControladorPersistenciaReservaHabitacion controladorPersistenciaReservaHabitacion = new ControladorPersistenciaReservaHabitacion();

    public void guardarReserva(String dni, int numeroHospedados, LocalDateTime fechaLlegada,
            LocalDateTime fechaSalida, String habitacion1, String habitacion2, String habitacion3) {

        Cliente clienteExistente = controladorPersistenciaCliente.buscarClientePorDni(dni);

        if (clienteExistente == null) {

            JOptionPane.showMessageDialog(null, "El cliente con DNI " + dni + " no existe. "
                    + "Debe crear primero el cliente antes de hacer la reserva.",
                    "Cliente no encontrado", JOptionPane.ERROR_MESSAGE);
        } else {

            Habitacion habitacion1Entity = controladorPersistenciaHabitacion.buscarHabitacionPorTipo(habitacion1);
            Habitacion habitacion2Entity = controladorPersistenciaHabitacion.buscarHabitacionPorTipo(habitacion2);
            Habitacion habitacion3Entity = controladorPersistenciaHabitacion.buscarHabitacionPorTipo(habitacion3);

            Reserva reserva = new Reserva();
            reserva.setCliente(clienteExistente);
            reserva.setNumero_hospedados(numeroHospedados);
            reserva.setFecha_llegada(fechaLlegada);
            reserva.setFecha_salida(fechaSalida);

            controladorPersistenciaReserva.guardarReserva(reserva);

            List<Reserva_Habitacion> reservaHabitaciones = new ArrayList<>();
            if (habitacion1Entity != null) {
                Reserva_Habitacion reservaHabitacion1 = new Reserva_Habitacion();
                reservaHabitacion1.setReserva(reserva);
                reservaHabitacion1.setHabitacion(habitacion1Entity);
                reservaHabitaciones.add(reservaHabitacion1);
            }
            if (habitacion2Entity != null) {
                Reserva_Habitacion reservaHabitacion2 = new Reserva_Habitacion();
                reservaHabitacion2.setReserva(reserva);
                reservaHabitacion2.setHabitacion(habitacion2Entity);
                reservaHabitaciones.add(reservaHabitacion2);
            }
            if (habitacion3Entity != null) {
                Reserva_Habitacion reservaHabitacion3 = new Reserva_Habitacion();
                reservaHabitacion3.setReserva(reserva);
                reservaHabitacion3.setHabitacion(habitacion3Entity);
                reservaHabitaciones.add(reservaHabitacion3);
            }

            for (Reserva_Habitacion reservaHabitacion : reservaHabitaciones) {
                controladorPersistenciaReservaHabitacion.insertarReservaHabitacion(reservaHabitacion);
            }
        }
    }

    public List<Reserva> listarReserva() {
        return controladorPersistenciaReserva.listarReserva();
    }

    public void eliminarReserva(int idReserva) {
        controladorPersistenciaReserva.eliminarReserva(idReserva);
    }

    public Reserva listarReserva(int idReserva) {
        return controladorPersistenciaReserva.listarReserva(idReserva);
    }

    public void modificarReserva(Reserva reserva, String dni, int numeroHospedados, LocalDateTime fechaLlegada,
            LocalDateTime fechaSalida, String habitacion1, String habitacion2, String habitacion3) {

        int reservaId = reserva.getReserva_id();
        List<String> habitacionIdsList = new ArrayList<>();

        if (!habitacion1.isEmpty()) {
            Habitacion hab1 = controladorPersistenciaHabitacion.buscarHabitacionPorTipo(habitacion1);
            if (hab1 != null) {
                habitacionIdsList.add(String.valueOf(hab1.getHabitacion_id()));
            }
        }
        if (!habitacion2.isEmpty()) {
            Habitacion hab2 = controladorPersistenciaHabitacion.buscarHabitacionPorTipo(habitacion2);
            if (hab2 != null) {
                habitacionIdsList.add(String.valueOf(hab2.getHabitacion_id()));
            }
        }
        if (!habitacion3.isEmpty()) {
            Habitacion hab3 = controladorPersistenciaHabitacion.buscarHabitacionPorTipo(habitacion3);
            if (hab3 != null) {
                habitacionIdsList.add(String.valueOf(hab3.getHabitacion_id()));
            }
        }

        String habitacionIds = String.join(",", habitacionIdsList);

        controladorPersistenciaReserva.modificarReserva(reservaId, habitacionIds, fechaLlegada,
                fechaSalida, numeroHospedados);
    }

    public Reserva obtenerReservaAsociadaCliente(String dniCliente) {
        return controladorPersistenciaReserva.obtenerReservaAsociadaCliente(dniCliente);
    }

}
