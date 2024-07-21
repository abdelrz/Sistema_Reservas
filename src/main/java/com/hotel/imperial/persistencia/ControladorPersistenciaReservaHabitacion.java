package com.hotel.imperial.persistencia;

import com.hotel.imperial.entidades.Reserva_Habitacion;
import com.hotel.imperial.jpa.Reserva_HabitacionJpaController;

public class ControladorPersistenciaReservaHabitacion {

    Reserva_HabitacionJpaController reserva_HabitacionJpaController = new Reserva_HabitacionJpaController();

    public void insertarReservaHabitacion(Reserva_Habitacion reserva_Habitacion) {
        reserva_HabitacionJpaController.create(reserva_Habitacion);
    }
}
